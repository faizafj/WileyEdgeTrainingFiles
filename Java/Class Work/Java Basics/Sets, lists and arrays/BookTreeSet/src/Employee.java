public class Employee implements Comparable<Employee> {

    private final int employeeId; //define all the variables needed
    private final String employeeName;
    private final int yearsOfExperience;
    private final String jobRole;
    private final String department;
    private final int salary;

    public Employee(int employeeId, String employeeName, int yearsOfExperience, String jobRole, String department, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.yearsOfExperience = yearsOfExperience;
        this.jobRole = jobRole;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee2) { //compares current employee to employee2
        if (salary > employee2.salary) //if current employee salary is more
            return 1; //return 1
        else if (salary < employee2.salary) //else if current employee salary is less
            return -1;
        else if (this.equals(employee2)) //if they're the same return 0
            return 0;
        return 1;
    }
}
