package java_project_a;
import java.util.*;
import java.util.stream.Collectors;

public class SortingExample {
	public static void main(String[] args) {

        // sort employee by salary in ascending order
        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        List < Employee > employeesSortedList1 = employees.stream()
            .sorted((o1, o2) ->(o2.getName().compareTo(o1.getName()))).collect(Collectors.toList());
       System.out.println(employeesSortedList1);

        List < Employee > employeesSortedList2 = employees.stream()
            .sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()); //ascending order
        System.out.println(employeesSortedList2);
    }

}
