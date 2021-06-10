package com.lhint.springdemo.service;

import com.lhint.springdemo.Entities.Employee;
import com.lhint.springdemo.repository.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepositoryImpl employeeRepository;

    public EmployeeServiceImpl(){
    }

    public void addEmployee(Employee employee){
        employeeRepository.addEmployee(employee);
    }
    public void deleteEmployee(Integer id){
        employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.update(employee);
    }

    public List<Employee> listAll(){
        return employeeRepository.listAll();
    }

    public Employee findById(Integer id){
        return employeeRepository.findById(id);
    }

}
