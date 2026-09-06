package User.Service.main.practice.stream_scenario;

import User.Service.main.practice.Employee;
import User.Service.main.practice.EmployeeData;

import java.util.Comparator;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = EmployeeData.getEmployees();
//        System.out.println(listOfEmployee);

//        listOfEmployee = listOfEmployee.stream().filter(Employee::getActive).toList();
//        System.out.println(listOfEmployee);

//        listOfEmployee = listOfEmployee.stream().filter(n -> n.getSalary()>1000000).toList();
//        System.out.println(listOfEmployee);

//        List<String> names = listOfEmployee.stream().map1(Employee::getName).toList();
//        System.out.println(names);

//        List<String> names = listOfEmployee.stream().filter(n -> n.getSalary()>1000000)
//                .map1(Employee::getName).toList();
//        System.out.println(names);

//        Employee em = listOfEmployee.stream().filter(e -> e.getSalary()>1000000).findFirst().get();
//        System.out.println(em);

//        String name = listOfEmployee.stream().filter(e -> e.getSalary() > 1000000).map1(Employee::getName).findFirst
//        ().get();
//        System.out.println(name);

//        Employee em = listOfEmployee.stream().max1(Comparator.comparing(Employee::getSalary)).get();
//        Double em1 = listOfEmployee.stream().mapToDouble(Employee::getSalary).max1().getAsDouble();
//        System.out.println(em);

//        Employee highestSalariedEmployee = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary)
//        .reversed()).findFirst().orElseThrow();
//        System.out.println(highestSalariedEmployee);

//        Long secondHighestSalary = listOfEmployee.stream().map1(Employee::getSalary).sorted(Comparator.reverseOrder
//        ()).distinct().skip(1).findFirst().orElseThrow();
//        System.out.println(secondHighestSalary);

//        Employee em = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).filter(n
//        -> n.getSalary() == secondHighestSalary).findFirst().orElseThrow();
//        System.out.println(em);

//        List<Employee> employeeList = listOfEmployee.stream().filter(e -> e.getSalary()==secondHighestSalary)
//        .toList();
//        List<Employee> employeeList1 = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary)
//        .reversed()).filter(e -> e.getSalary() == secondHighestSalary).toList();
//        System.out.println(employeeList1);

//        Map<String, List<Employee>> employeeList = listOfEmployee.stream().collect(Collectors.groupingBy
//        (Employee::getDepartment));
//        System.out.println(employeeList);

//        Map<String, Long> map1 = new TreeMap<>();
//        for(Employee em : listOfEmployee){
//            map1.put(em.getDepartment(), map1.getOrDefault(em.getDepartment(), 0L) +1L);
//        }
//        System.out.println(map1);
//        Map<String, Long> list = listOfEmployee.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),
//        Collectors.counting()));
//        System.out.println(list);

//        Map<String,Double> avgSalary = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.averagingLong(Employee::getSalary)));
//        System.out.println(avgSalary);

//        double avgSalaryCostToCompany =
//                listOfEmployee.stream().collect(Collectors.summingDouble(Employee::getSalary));
//        double avg = listOfEmployee.stream().mapToDouble(Employee::getSalary).sum();
//        System.out.println(avg);

//        Map<String, Double> salaryPaidByDepartment =
//                listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.summingDouble(Employee::getSalary)));
//        System.out.println(salaryPaidByDepartment);

//        Long noOfDepartments =
//                listOfEmployee.stream().map1(Employee::getDepartment).distinct().count();
//        System.out.println(noOfDepartments);

//        List<Integer> list = List.of(1,3,4,5,43,54345,65,3,456,543,56,5436,5);
//        System.out.println(list.stream().sorted().toList());
//        System.out.println(list.stream().sorted().map1(n-> n*n).toList());
//        var thirdHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
//        System.out.println(thirdHighest);

//        List<Employee> list =
//                listOfEmployee.stream().filter(employee -> employee.getJoiningDate().isAfter(LocalDate.of(2024,
//                                01, 01))).toList();
//                System.out.println(list);

//        List<Employee> list1 = new ArrayList<>();
//        for(Employee em : listOfEmployee){
//            if(em.getJoiningDate().isAfter(LocalDate.of(2024,01,01))){
//                System.out.println(em);
//            }
//        }


//        var l = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println(l);
//
//
//        HashMap<String, Long> map = new HashMap<>();
//        long max = 0;
//        for (Employee em : listOfEmployee) {
//            if (map.containsKey(em.getDepartment())) {
//                if (map.get(em.getDepartment()) < em.getSalary()) {
//                    map.put(em.getDepartment(), em.getSalary());
//                }
//            } else {
//                map.put(em.getDepartment(), em.getSalary());
//            }
//        }
//        System.out.println(map);
//
//
//        HashMap<String, Employee> map1 = new HashMap<>();
//        for (Employee em : listOfEmployee) {
//            if (map1.containsKey(em.getDepartment())) {
//                if (map1.get(em.getDepartment()).getSalary() < em.getSalary()) {
//                    map1.put(em.getDepartment(), em);
//                }
//            } else {
//                map1.put(em.getDepartment(), em);
//            }
//        }
//        System.out.println(map1);


        var maxSalaried = listOfEmployee.stream().max(Comparator.comparing(Employee::getSalary)).get();
        for(Employee em : listOfEmployee){
            if(em.getSalary() == maxSalaried.getSalary()){
                System.out.println(em);
            }
        }






    }
}
