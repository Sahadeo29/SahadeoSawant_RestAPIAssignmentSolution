package in.greatlearning.Employee_Management.repositories;

import in.greatlearning.Employee_Management.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByIdAllIgnoreCase(int theId);
    List<Employee> findByNameAllIgnoreCase(String firstName);
}
