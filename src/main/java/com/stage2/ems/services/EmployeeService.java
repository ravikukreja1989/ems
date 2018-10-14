package com.stage2.ems.services;

import com.stage2.ems.entity.Employee;

import java.util.List;

/**
 * Created by e075044 on 10/9/2018.
 */
public interface EmployeeService {
    Employee saveEmployee(Employee e);
    List<Employee> findAllEmployees();
    List<Employee> findAll();
    void deleteEmployee(Long id);
    List<Employee> findByFirstName(String fname);

}
