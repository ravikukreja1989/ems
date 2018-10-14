package com.stage2.ems.services;

import com.stage2.ems.entity.Department;

import java.util.List;

/**
 * Created by e075044 on 10/9/2018.
 */
public interface DepartmentService {
    List<Department> findAllDepartments();
}
