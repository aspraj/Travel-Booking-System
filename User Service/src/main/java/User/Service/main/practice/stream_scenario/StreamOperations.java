package User.Service.main.practice.stream_scenario;

import User.Service.main.practice.Employee;
import User.Service.main.practice.EmployeeData;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = EmployeeData.getEmployees();
//        System.out.println(listOfEmployee);

//        listOfEmployee = listOfEmployee.stream().filter(Employee::getActive).toList();
//        System.out.println(listOfEmployee);

//        listOfEmployee = listOfEmployee.stream().filter(n -> n.getSalary()>1000000).toList();
//        System.out.println(listOfEmployee);

//        List<String> names = listOfEmployee.stream().map(Employee::getName).toList();
//        System.out.println(names);

//        List<String> names = listOfEmployee.stream().filter(n -> n.getSalary()>1000000)
//                .map(Employee::getName).toList();
//        System.out.println(names);
        
//        Employee em = listOfEmployee.stream().filter(e -> e.getSalary()>1000000).findFirst().get();
//        System.out.println(em);

//        String name = listOfEmployee.stream().filter(e -> e.getSalary() > 1000000).map(Employee::getName).findFirst().get();
//        System.out.println(name);

//        Employee em = listOfEmployee.stream().max(Comparator.comparing(Employee::getSalary)).get();
//        Double em1 = listOfEmployee.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
//        System.out.println(em);

//        Employee highestSalariedEmployee = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().orElseThrow();
//        System.out.println(highestSalariedEmployee);

//        Long secondHighestSalary = listOfEmployee.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow();
//        System.out.println(secondHighestSalary);

//        Employee em = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).filter(n -> n.getSalary() == secondHighestSalary).findFirst().orElseThrow();
//        System.out.println(em);

//        List<Employee> employeeList = listOfEmployee.stream().filter(e -> e.getSalary()==secondHighestSalary).toList();
//        List<Employee> employeeList1 = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).filter(e -> e.getSalary() == secondHighestSalary).toList();
//        System.out.println(employeeList1);

//        Map<String, List<Employee>> employeeList = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(employeeList);

//        Map<String, Long> map = new TreeMap<>();
//        for(Employee em : listOfEmployee){
//            map.put(em.getDepartment(), map.getOrDefault(em.getDepartment(), 0L) +1L);
//        }
//        System.out.println(map);
//        Map<String, Long> list = listOfEmployee.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
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

        Long noOfDepartments =
                listOfEmployee.stream().map(Employee::getDepartment).distinct().count();
        System.out.println(noOfDepartments);

    }
}
