package com.springboot.EmployeeCRM.controller;

import com.springboot.EmployeeCRM.dao.EmployeeDAO;
import com.springboot.EmployeeCRM.entity.Employee;
import com.springboot.EmployeeCRM.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService thEmployeeService){
        employeeService=thEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
