package com.lhint.springdemo.repository;

import com.lhint.springdemo.Entities.Salary;
import com.lhint.springdemo.Entities.SalaryId;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class SalaryRepositoryImpl implements SalaryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SalaryRepositoryImpl() {

    }

    @Transactional
    public void addSalary(Salary salary) {
        entityManager.persist(salary);
    }


    @Transactional
    public void deleteSalary(SalaryId id) {
        entityManager.remove(findById(id));
    }

    @Transactional
    public Salary update(Salary salary) {
        entityManager.merge(salary);

        return salary;
    }

        public List<Salary> listAll() {
        return entityManager.createQuery("from Salary").getResultList();
    }

    public Salary findById(SalaryId id) {
        return entityManager.find(Salary.class, id);
    }
}
