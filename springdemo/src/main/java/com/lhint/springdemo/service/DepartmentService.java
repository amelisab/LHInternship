package com.lhint.springdemo.service;

import com.lhint.springdemo.Entities.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);
    void deleteDepartment(Integer id);
    public Department updateDepartment(Department department);
    List<Department> listAll();
    Department findById(Integer id);
}
