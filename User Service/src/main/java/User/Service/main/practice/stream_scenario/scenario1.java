package User.Service.main.practice.stream_scenario;

import java.util.Arrays;
import java.util.List;

public class scenario1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 34, 5, 67, 65, 432, 7, 6543, 3, 8765, 43);

        int a = list.stream().mapToInt(Integer::intValue).sum();

        int b = list.stream().reduce(0, (c, d) -> c + d);

        int f = 0;
        for (int e : list) {
            f += e;
        }
        System.out.println(f);

    }
}


