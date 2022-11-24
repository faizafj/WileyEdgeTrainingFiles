import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employeeCollection = new TreeSet<Employee>();

        employeeCollection.add(new Employee(1, "Faiza", 2, "Software Dev", "IT", 20000));
        employeeCollection.add(new Employee(2, "Jane", 9, "Mobile Dev", "IT", 200000));
        employeeCollection.add(new Employee(3, "David", 3, "HR Manager", "HR", 28000));
        employeeCollection.add(new Employee(4, "Louise", 3, "Software Dev", "IT", 30000));
        employeeCollection.add(new Employee(5, "Will", 4, "Project Manager", "Business", 34000));

        System.out.println("Size : " + employeeCollection.size()); //print out the size of the employee set
        System.out.println(employeeCollection);

        System.out.println("Traversal using for each loop");
        for (Employee employee : employeeCollection) {
            System.out.println(employee);
        }

        System.out.println("Traversal using Iterator");
        Iterator<Employee> iterator = employeeCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


}