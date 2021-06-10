package com.lhint.springdemo.service;

import com.lhint.springdemo.Entities.Department;
import com.lhint.springdemo.repository.DepartmentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepositoryImpl departmentRepository;

    public DepartmentServiceImpl(){

    }

    public void addDepartment(Department department){
        departmentRepository.addDepartment(department);
    }
    public void deleteDepartment(Integer id){
        departmentRepository.deleteDepartment(id);
    }

    public Department updateDepartment(Department department) {
        return departmentRepository.update(department);
    }

    public List<Department> listAll(){
        return departmentRepository.listAll();
    }

    public Department findById(Integer id){
        return departmentRepository.findById(id);
    }

}
