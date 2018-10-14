package com.stage2.ems.controller;

import com.stage2.ems.entity.Department;
import com.stage2.ems.entity.Employee;
import com.stage2.ems.services.DepartmentService;
import com.stage2.ems.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by e075044 on 10/9/2018.
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/employee/register")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
        Employee createdEmp = employeeService.saveEmployee(emp);
        if (createdEmp == null) {
            return new ResponseEntity<>(createdEmp, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdEmp, HttpStatus.OK);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return new ResponseEntity<>(departmentService.findAllDepartments(), HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.findAllEmployees(),HttpStatus.OK);
    }

    @GetMapping("/employees/{fname}")
    public List<Employee> getAllEmployeesByName(@PathVariable("fname") String fname) {
        return employeeService.findByFirstName(fname);
    }

    @DeleteMapping("/employee/{id}/delete")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }

}
