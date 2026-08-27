package User.Service.main.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String email;
    private String department;
    private String designation;
    private long salary;
    private Integer age;
    private String city;
    private LocalDate joiningDate;
    private Boolean active;
}