package com.stage2.ems.repository;

import com.stage2.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by e075044 on 10/10/2018.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFirstName(String firstName);

    @Query(value="select * from employee e order by dept_Id", nativeQuery = true)
    List<Employee> findAllEmployee();


}


