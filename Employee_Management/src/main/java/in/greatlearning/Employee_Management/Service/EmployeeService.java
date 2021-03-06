package in.greatlearning.Employee_Management.Service;

import in.greatlearning.Employee_Management.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);

    List<Employee> searchBy(String firstName);

}
