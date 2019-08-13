import Employee_Portal.model.Employee;
import Employee_Portal.repository.EmployeeRepository;
import Employee_Portal.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {


    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;
    @Before
    public void setUp() {
        employeeService = new EmployeeService();
        MockitoAnnotations.initMocks(this);
    }

    //To test getAllEmployeesSortedByFirstName sorts Employee objects in ascending order by First Name
    @Test
    public void testGetAllEmployeesSortedByFirstName() {
        // set up data
        List<Employee> mockEmployeeList = new ArrayList<Employee>();
        mockEmployeeList.add(new Employee(1L, "Stuart", "Ribery", 'M', new Date(1991,11,23), "Accounting" ));
        mockEmployeeList.add(new Employee(2L, "Ellyse", "Perry", 'F', new Date(1996,8,3), "IT" ));
        mockEmployeeList.add(new Employee(3L, "Andy", "Bernard", 'M', new Date(1987,2,20), "Finance" ));
        mockEmployeeList.add(new Employee(4L, "Tim", "Paine", 'M', new Date(1976,6,13), "IT" ));


        List<Employee> result = employeeService.getAllEmployeesSortedByFirstName(mockEmployeeList);

        // assert
        assertEquals("Andy", result.get(0).getFirstName());
        assertEquals("Ellyse", result.get(1).getFirstName());
        assertEquals("Stuart", result.get(2).getFirstName());
        assertEquals("Tim", result.get(3).getFirstName());
    }
}