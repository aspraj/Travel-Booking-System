package User.Service.main.practice.map_scenarios;

import User.Service.main.practice.Employee;
import User.Service.main.practice.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OperationsMap {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = EmployeeData.getEmployees();

//        Map<Integer, String> employeeMap = new TreeMap<>();
//        for(Employee e : listOfEmployee){
//            employeeMap.put(Math.toIntExact(e.getId()),e.getName());
//        }
//        employeeMap.forEach((a,b)-> System.out.println("Key: " + a + " Value: " + b));

//        Map<Long, Employee> employeeMap = new TreeMap<>();
//        for (Employee employee : listOfEmployee) {
//            employeeMap.put(employee.getId(), employee);
//        }
//        employeeMap.forEach((id, employee) -> System.out.println(id + " -> " + employee));

//        Employee employee = employeeMap.get(55L);
//        System.out.println("Employee with ID " + employee);

//        Map<Long, Employee> employeeMap = new TreeMap<>();
//        for (Employee employee : listOfEmployee) {
//            employeeMap.put(employee.getId(), employee);
//        }
//        if (employeeMap.containsKey(500L)) {
//            System.out.println("Employee 500 exist");
//        } else {
//            System.out.println("Employee not 500 exist");
//        }

//        Map<Long, Employee> employeeMap = new TreeMap<>();
//        for (Employee employee : listOfEmployee) {
//            employeeMap.put(employee.getId(), employee);
//        }
//        Employee employee = employeeMap.get(55L);
//        System.out.println(employee);
//        employee.setSalary(100000);
//        System.out.println(employee);

//        for(Employee employee : listOfEmployee){
//            if(employee.getId() == 55){
//                listOfEmployee.remove(employee);
//            }
//        }
////        listOfEmployee.removeIf(employee -> employee.getId() == 55);
//        System.out.println(listOfEmployee);

        Map<Long, Employee> employeeMap = new TreeMap<>();
        for(Employee employee : listOfEmployee){
            employeeMap.put(employee.getId(), employee);
        }
        Employee employee = employeeMap.get(55L);
        employeeMap.remove(55L);
        System.out.println(employeeMap);

        if(employeeMap.containsKey(55L)){
            Employee removedEmployee = employeeMap.remove(55L);
            System.out.println(removedEmployee);
            System.out.println("Exist");
        }
        else {
            System.out.println("not Exist");
        }
    }
}
