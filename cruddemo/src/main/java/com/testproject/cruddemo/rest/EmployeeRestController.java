package com.testproject.cruddemo.rest;

import com.testproject.cruddemo.dao.EmployeeDAO;
import com.testproject.cruddemo.entity.Employee;
import com.testproject.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    // expose "/employee" and return a list of employee
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

}
