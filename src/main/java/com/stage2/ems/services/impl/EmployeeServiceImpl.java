package com.stage2.ems.services.impl;

import com.stage2.ems.entity.Employee;
import com.stage2.ems.repository.EmployeeRepository;
import com.stage2.ems.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by e075044 on 10/9/2018.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public List<Employee> findAllEmployees() {
        List<Employee> emplList = employeeRepository.findAll();
        Comparator<Employee> deptComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getDepartment().getDeptId().compareTo(e2.getDepartment().getDeptId());
            }
        };

        Collections.sort(emplList,deptComparator);
        return emplList;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllEmployee();
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findByFirstName(String fname) {
        return employeeRepository.findByFirstName(fname);
    }
}
