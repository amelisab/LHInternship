package com.lhint.springdemo.repository;

import com.lhint.springdemo.Entities.Salary;
import com.lhint.springdemo.Entities.SalaryId;

import java.util.List;

public interface SalaryRepository {

    void addSalary(Salary salary);
    void deleteSalary(SalaryId id);
    public Salary update(Salary salary);
    List<Salary> listAll();
    Salary findById(SalaryId id);
}
