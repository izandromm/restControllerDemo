package com.testproject.cruddemo.dao;

import com.testproject.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
