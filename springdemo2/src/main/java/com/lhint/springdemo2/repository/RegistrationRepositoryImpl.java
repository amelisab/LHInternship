package com.lhint.springdemo2.repository;

import com.lhint.springdemo2.model.Registration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void create(Registration registration) {
        entityManager.persist(registration);
    }

    @Transactional
    @Override
    public Registration update(Registration registration) {
        return entityManager.merge(registration);
    }

    @Override
    public Registration findById(Integer id) {
        return entityManager.find(Registration.class, id);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        entityManager.remove(findById(id));
    }

    @Override
    public List<Registration> listAll() {
        return entityManager.createQuery("from Registration").getResultList();
    }
}
