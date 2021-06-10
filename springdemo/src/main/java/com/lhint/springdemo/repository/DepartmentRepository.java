package com.lhint.springdemo.repository;

import com.lhint.springdemo.Entities.Department;

import java.util.List;

public interface DepartmentRepository {

    void addDepartment(Department department);
    void deleteDepartment(Integer id);
    public Department update(Department department);
    List<Department> listAll();
    Department findById(Integer id);

}
