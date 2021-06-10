package com.lhint.springdemo.service;

import com.lhint.springdemo.Entities.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);
    void deleteEmployee(Integer id);
    public Employee updateEmployee(Employee employee);
    List<Employee> listAll();
    Employee findById(Integer id);

}
