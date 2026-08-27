package User.Service.main.practice.stream_scenario;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Map {
    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>(List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50));

        list.add(5);
        list.remove(4);
        System.out.println(list);

        Set<Integer> set = new TreeSet<>();
        Set<Integer> set1 = new HashSet<>();


        set.add(9);
        set.add(345);
        set.add(4);
        set.add(7);
        set.add(2);
        set.add(55);

        System.out.println(set);


//        List<Integer> list = List.of(5,10,15,20,25,30,35,40,45,50);
//        int sum = 55;
//        Set<Integer> set = new HashSet<>();
//        for(Integer li : list){
//            int a = sum - li;
//            if(set.contains(a)){
//                System.out.println(a + " + " + li + " = 55" );
//            }
//            set.add(li);
//        }
    }
}
