package com.stage2.ems.repository;

import com.stage2.ems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by e075044 on 10/10/2018.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}


