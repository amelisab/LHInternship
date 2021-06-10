package com.lhint.springdemo.repository;

import com.lhint.springdemo.Entities.Employee;

import java.util.List;

public interface EmployeeRepository {

	void addEmployee(Employee employee);
	void deleteEmployee(Integer id);
	public Employee update(Employee employee);
	List<Employee> listAll();
	Employee findById(Integer id);

}