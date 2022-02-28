package com.database.h2.springbooth2db.controller;

import java.util.List;

import com.database.h2.springbooth2db.dao.EmployeeRepository;
import com.database.h2.springbooth2db.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "EMployee Object Saved Successfully";
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
    @GetMapping("/getEmployeeBy/{dept}")
    public List<Employee> getEmployeeByDept(@PathVariable String dept) {
        return employeeRepository.findByDept(dept);
    }

    @DeleteMapping("/remove/{id}") 
    public int removeEmployeeByDept(@PathVariable int id) {
        employeeRepository.deleteById(id);
        return 1;
    }

}
