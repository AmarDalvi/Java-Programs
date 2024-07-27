package JavaStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Sort employee by salary in ascending and descending order using stream api
public class SortBySalary {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Amar",500000,21));
        employees.add(new Employee(20,"Yash",100000,25));
        employees.add(new Employee(30,"Kunal",300000,40));
        employees.add(new Employee(40,"Vaishnavi",400000,30));

//        Ascending order
        List<Employee>sortedEmployee = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(sortedEmployee);
        System.out.println("_______________________________________");


//        Ascending using lambda function
        List<Employee>sortedEmployee2 = employees.stream()
                .sorted(( o1,  o2)->(int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(sortedEmployee2);
        System.out.println("_______________________________________");

//        Descending order
        List<Employee>sortedEmployeeDesc = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.getSalary() - o1.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(sortedEmployeeDesc);
        System.out.println("_______________________________________");

//        comparator reverse method
        List<Employee>sortedEmployeeDesc2 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortedEmployeeDesc2);
        System.out.println("_______________________________________");






    }

}
