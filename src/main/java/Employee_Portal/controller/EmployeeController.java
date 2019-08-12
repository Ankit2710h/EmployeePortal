package Employee_Portal.controller;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import Employee_Portal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Employee_Portal.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> list= employeeRepository.findAll();
        Collections.sort(list);
        return list;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        System.out.println(employee);
        return employeeRepository.save(employee);
    }
}

