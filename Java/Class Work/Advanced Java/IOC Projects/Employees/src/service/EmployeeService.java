package service;

import java.util.Collection;
import java.util.List;

import entity.Employee;
import entity.EmployeePaySlip;

public interface EmployeeService {

    Collection<Employee> getAllEmployees();

    Employee searchEmployeeById(int id);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(int id);

    boolean incrementSalary(int id, double increment);

    EmployeePaySlip generatePaySlip(int employeeId);


    //My code
    List<Employee> searchEmployeeByDepartment(String empDepartment); // Type is List of employees
}
