package com.database.h2.springbooth2db.dao;

import java.util.List;

import com.database.h2.springbooth2db.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    List<Employee> findByDept(String dept);   
    
}
