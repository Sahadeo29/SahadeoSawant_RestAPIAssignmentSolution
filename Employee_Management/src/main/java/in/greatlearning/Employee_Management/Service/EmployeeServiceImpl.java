package in.greatlearning.Employee_Management.Service;

import in.greatlearning.Employee_Management.entities.Employee;
import in.greatlearning.Employee_Management.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeRepository.getById(theId);
    }

    @Override
    public void save(Employee theEmployee) {

        employeeRepository.save(theEmployee);

    }

    @Override
    public void deleteById(int theId) {

        employeeRepository.deleteById(theId);

    }

    @Override
    public List<Employee> searchBy(String firstName) {

        return employeeRepository.findByNameAllIgnoreCase(firstName);

    }
}
