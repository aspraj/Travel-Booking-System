package User.Service.main.practice.stream_scenario;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,33,4,5,4,5654,54,34,5,3,455,3);
        List<String> str = List.of("asp", "asp", "aman" , "raj", "aspraj", "Singh" , "patel");
        List<Integer> list1 = Arrays.asList(1,3,33,4,5,4,5654,54,34,5,3,455,3);

//        list = list.stream().sorted().toList();
//        list1 = list1.stream().map(n -> n*n).toList();
//        str = str.stream().distinct().sorted().filter(n -> n.startsWith("a")).toList();
//        str = str.stream().distinct().sorted().filter(n -> n.length()>4).toList();
//        str = str.stream().distinct().sorted().map(String::toLowerCase).toList();
//        str = str.stream().distinct().sorted().map(String::toUpperCase).toList();
//        str = str.stream().distinct().map(String::toUpperCase).sorted().toList();
//        str = str.stream().distinct().map(String::toUpperCase).sorted().toList();
        int a = list1.stream().mapToInt(Integer::intValue).sum();

        System.out.println(a);
    }
}
