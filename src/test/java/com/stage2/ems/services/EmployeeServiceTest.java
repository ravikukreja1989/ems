package com.stage2.ems.services;

import com.stage2.ems.entity.Employee;
import com.stage2.ems.repository.EmployeeRepository;
import com.stage2.ems.services.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyMapOf;
import static org.mockito.Mockito.when;

/**
 * Created by e075044 on 10/14/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Test
    public void findAllEmployeesTest(){
        List<Employee> emplList = new ArrayList<>();
        Employee e = new Employee();
        e.setFirstName("A");
        e.setLastName("B");
        emplList.add(e);
        when(employeeRepository.findAll()).thenReturn(emplList);
        List<Employee> actualList = employeeService.findAllEmployees();
        Assert.assertEquals(emplList.size(),actualList.size());
    }
}
