package Employee_Portal.service;

import Employee_Portal.model.Employee;
import Employee_Portal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> list= employeeRepository.findAll();
        return getAllEmployeesSortedByFirstName(list);
    }

    public List<Employee> getAllEmployeesSortedByFirstName(List<Employee> employeeList)
    {
        Collections.sort(employeeList);
        return employeeList;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
