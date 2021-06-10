package com.lhint.springdemo.service;

import com.lhint.springdemo.Entities.Salary;
import com.lhint.springdemo.Entities.SalaryId;

import java.util.List;

public interface SalaryService {

    void addSalary(Salary salary);
    void deleteSalary(SalaryId id);
    public Salary updateSalary(Salary salary);
    List<Salary> listAll();
    Salary findById(SalaryId id);

}
