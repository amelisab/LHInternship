package com.lhint.springdemo.repository;


import com.lhint.springdemo.Entities.Department;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

//    The @PersistenceContext annotation in your code is being used to indicate that
//    the EntityManager must be automatically injected, in other words its lifecycle
//    will be managed by the container running your application
    @PersistenceContext
    private EntityManager entityManager;

    public DepartmentRepositoryImpl() {

    }

    @Transactional
    public void addDepartment(Department department) {
        entityManager.persist(department);
    }

    @Transactional
    public void deleteDepartment(Integer id) {
        entityManager.remove(findById(id));
    }

    public List<Department> listAll() {

        return entityManager.createQuery("from Department").getResultList();
    }

    @Transactional
    public Department update(Department department){
        entityManager.merge(department);

        return department;
    }

    public Department findById(Integer id) {
        return entityManager.find(Department.class, id);
    }
}

