package com.lhint.springdemo.service;

import com.lhint.springdemo.Entities.Salary;
import com.lhint.springdemo.Entities.SalaryId;
import com.lhint.springdemo.repository.SalaryRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepositoryImpl salaryRepository;


    public SalaryServiceImpl() {
    }

    public void addSalary(Salary salary) {
        salaryRepository.addSalary(salary);
    }

    public void deleteSalary(SalaryId id) {
        salaryRepository.deleteSalary(id);
    }

    public Salary updateSalary(Salary salary) {
        return salaryRepository.update(salary);
    }

    public List<Salary> listAll() {
        return salaryRepository.listAll();
    }

    public Salary findById(SalaryId id) {
        return salaryRepository.findById(id);
    }
}
