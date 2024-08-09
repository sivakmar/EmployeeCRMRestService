package com.springboot.EmployeeCRM.controller;

import com.springboot.EmployeeCRM.dao.EmployeeDAO;
import com.springboot.EmployeeCRM.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAO theemployeeDAO){
        employeeDAO=theemployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

}
