package User.Service.main.practice.map_scenarios;

import User.Service.main.practice.Employee;
import User.Service.main.practice.EmployeeData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LogicMap {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = EmployeeData.getEmployees();
//        Map<Long, Employee> employeeMap = new TreeMap<>();
//        for(Employee employee : listOfEmployee){
//            employeeMap.put(employee.getId(),employee);
//        }
//        Employee highestSalaryEmployee = new Employee();
//        for(Employee employee: employeeMap.values()){
//            if(highestSalaryEmployee.getSalary()< employee.getSalary()){
//                highestSalaryEmployee = employee;
//            }
//        }
//        Employee highestSalaryEmployee = new Employee();
//        for(Employee employee : listOfEmployee){
//            if(highestSalaryEmployee.getSalary()< employee.getSalary()){
//                highestSalaryEmployee = employee;
//            }
//        }
//        System.out.println(highestSalaryEmployee);
//        Employee employee = listOfEmployee.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow();
//        System.out.println(employee);

//        department count \

//        Map<Long, Employee> employeeMap = new TreeMap<>();
//        for (Employee employee : listOfEmployee) {
//            employeeMap.put(employee.getId(), employee);
//        }
//        Map<String, Integer> departmentCount = new TreeMap<>();
//        for (Employee employee : employeeMap.values()) {
//            departmentCount.put(employee.getDepartment(),
//                    departmentCount.getOrDefault(employee.getDepartment(), 0) + 1);
//        }
//        System.out.println("department count by map : " + departmentCount);
//
//        Map<String, Long> listOfEmployeeByDepartment =
//                listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting
//                ()));
//        System.out.println("by stream : " + listOfEmployeeByDepartment);

//        Map<Long, Employee> employeeMap = new TreeMap<>();
//        for (Employee employee : listOfEmployee) {
//            employeeMap.put(employee.getId(), employee);
//        }
//        Map<String, List<Employee>> departmentEmployeeCount = new TreeMap<>();
//        for (Employee employee : employeeMap.values()) {
//            departmentEmployeeCount.put(employee.getDepartment(), );
//        }

//        Map<String, List<Employee>> departmentEmployeeCount =
//                listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println("department count by map : " + departmentEmployeeCount);

//        find duplicate values

//        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 20);
//        Map<Integer, Integer> duplicateValues = new ConcurrentHashMap<>();
//        for(Integer in : numbers){
//            duplicateValues.put(in, duplicateValues.getOrDefault(in, 0)+1);
//        }
//        Set<Integer> set = new HashSet<>();
//
//        for(Map.Entry<Integer, Integer> i : duplicateValues.entrySet()){
//            if( i.getValue() > 1){
//                set.add(i.getKey());
//            }
//        }
//        System.out.println(set);

//        List<Integer> numbers =
//                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 20);
//        Map<Integer, Integer> duplicateValues = new LinkedHashMap<>();
//        for(Integer in : numbers){
//            duplicateValues.put(in, duplicateValues.getOrDefault(in, 0)+1);
//        }
//        for(Map.Entry<Integer, Integer> i : duplicateValues.entrySet()){
//            if( i.getValue() == 1){
//                System.out.println(i.getKey());
//                break;
//            }
//        }

//        Map<String, Integer> mapEmployee = new HashMap<>();
//        for(Employee employee : listOfEmployee){
//            mapEmployee.put(employee.getDepartment(), mapEmployee.getOrDefault(employee.getDepartment(), 0) +1);
//        }
//        System.out.println(mapEmployee);
//        String highestNoOfEmployeeInDepartment = "";
//        int no = 0;
//        for(Map.Entry<String, Integer> highDepartment : mapEmployee.entrySet()){
//            if(highDepartment.getValue() > no){
//                highestNoOfEmployeeInDepartment = highDepartment.getKey();
//                no = highDepartment.getValue();
//            }
//        }
//        System.out.println(highestNoOfEmployeeInDepartment);

//        List of salaries by department Map<Department, List<Salaries>>


//        Map<String, List<Long>> listOfSalariesByDepartment =
//                listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.mapping(Employee::getSalary, Collectors.toList())));
//        System.out.println(listOfSalariesByDepartment);

//        Map<String, TreeSet<Long>> listOfSalariesByDepartment = new HashMap<>();
//        for(Employee employee : listOfEmployee){
//            listOfSalariesByDepartment.computeIfAbsent(employee.getDepartment(), k -> new TreeSet<>()).add(employee
//            .getSalary());
//        }
//        System.out.println(listOfSalariesByDepartment);


//        Find the highest salary for each department
//        Map<String, Employee> departmentByEmployee = new HashMap<>();
//        for (Employee employee : listOfEmployee) {
//            if (departmentByEmployee.containsKey(employee.getDepartment())) {
//                if (employee.getSalary() > departmentByEmployee.get(employee.getDepartment()).getSalary())
//                    departmentByEmployee.put(employee.getDepartment(), employee);
//            } else {
//                departmentByEmployee.put(employee.getDepartment(), employee);
//            }
//        }
//        System.out.println(departmentByEmployee);


        List<String> process = Arrays.asList("aman", "singh", "patel", "asp", "tg", "par", "roj", "raj");
        var asp = process.stream().filter(str -> str != null && str.length() >= 3)
                .sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println(asp);
        List<String> tes =
                process.stream().filter(e -> e != null && e.length() >= 3).sorted(Comparator.reverseOrder()).toList();
        var res =
                process.stream().filter(e -> e != null && e.length() >= 3).sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println(res);
    }
}