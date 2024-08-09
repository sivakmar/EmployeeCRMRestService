package com.springboot.EmployeeCRM.service.implementation;

import com.springboot.EmployeeCRM.dao.EmployeeDAO;
import com.springboot.EmployeeCRM.dao.EmployeeDAOImpl;
import com.springboot.EmployeeCRM.entity.Employee;
import com.springboot.EmployeeCRM.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO)
    {
        employeeDAO=theEmployeeDAO;
    }


    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
