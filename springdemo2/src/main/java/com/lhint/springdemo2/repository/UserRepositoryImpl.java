package com.lhint.springdemo2.repository;

import com.lhint.springdemo2.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Transactional
    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Override
    public User findById(Integer id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        entityManager.remove(findById(id));
    }

    @Override
    public List<User> listAll() {
        return entityManager.createQuery("from User").getResultList();
    }
}
