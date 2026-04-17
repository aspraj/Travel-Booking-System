package User.Service.main.controller;

import User.Service.main.dto.LoginRequest;
import User.Service.main.entity.ApiResponse;
import User.Service.main.entity.BlacklistedToken;
import User.Service.main.entity.User;
import User.Service.main.repository.BlacklistedTokenRepository;
import User.Service.main.repository.UserRepository;
import User.Service.main.utils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;
    private final BlacklistedTokenRepository blacklistedTokenRepository;

    @PostMapping("/register")
    public ApiResponse<Object> register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ApiResponse.success("User registered successfully");
    }

    @PostMapping("/login")
    public ApiResponse<Map<String, String>> login(@RequestBody LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String accessToken = jwtUtil.generateToken(user.getEmail(), user.getRole());
        String refreshToken = jwtUtil.generateRefreshToken(user.getEmail());

        Map<String, String> tokens = new HashMap<>();
        tokens.put("accessToken", accessToken);
        tokens.put("refreshToken", refreshToken);

        return ApiResponse.success("Login successful", tokens);
    }

    @PostMapping("/refresh")
    public ApiResponse<Map<String, String>> refreshToken(@RequestParam String refreshToken) {

        if (!jwtUtil.validateToken(refreshToken)) {
            throw new RuntimeException("Invalid refresh token");
        }

        String username = jwtUtil.extractUsername(refreshToken);

        User user = userRepository.findByEmail(username)
                .orElseThrow();

        String newAccessToken =
                jwtUtil.generateToken(user.getEmail(), user.getRole());

        return ApiResponse.success(
                "Token refreshed",
                Map.of("accessToken", newAccessToken)
        );
    }

    @PostMapping("/logout")
    public ApiResponse<String> logout(HttpServletRequest request) {

        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);

            BlacklistedToken blacklisted = new BlacklistedToken();
            blacklisted.setToken(token); // ✅ correct object

            blacklistedTokenRepository.save(blacklisted);
        }

        return ApiResponse.success("Logged out successfully");
    }
}