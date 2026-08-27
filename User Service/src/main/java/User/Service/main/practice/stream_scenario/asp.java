package User.Service.main.practice.stream_scenario;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class asp {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Ankit", "Raj", "Abhishek", "Ravi");
        Map<Character, List<String>> list = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(list);
    }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 25, 5, 80, 45, 60);
//        int max = numbers.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
//        int max1 = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
//        int max12 = numbers.stream().reduce(Integer::max).get();
//        int max2 = numbers.stream().mapToInt(n -> n).max().getAsInt();
//        int max3 = numbers.stream().max((a,b)-> a>b ? a:b).get();
//        int SecondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(max+" "+ max1+" "+ max2+" "+ max3+" "+SecondHighest );
//    }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//        int d = numbers.stream().mapToInt(Integer::intValue).sum();
//        int c = numbers.stream().reduce(0,(a,b) -> a+b);
//        System.out.println(c +" , " + d);
//    }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(5, 12, 8, 21, 30, 17, 4, 25, 10);
//        numbers =
//                numbers.stream().filter(n -> n>10).map(n->n*2).sorted().toList();
//        System.out.println(numbers);
//    }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
//        numbers = numbers.stream().filter(n-> n>20).toList();
//        System.out.println(numbers);
//    }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 20, 50, 30, 60);
//        numbers = numbers.stream().distinct().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(numbers);
//    }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
//        numbers = numbers.stream().filter(n-> n%2 == 0).map(n ->n*2).toList();
//        System.out.println(numbers);
//    }
}
