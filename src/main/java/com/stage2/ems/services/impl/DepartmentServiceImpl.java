package com.stage2.ems.services.impl;

import com.stage2.ems.entity.Department;
import com.stage2.ems.repository.DepartmentRepository;
import com.stage2.ems.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by e075044 on 10/9/2018.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

}
