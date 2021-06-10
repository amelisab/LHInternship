package com.lhint.springdemo2.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lhint.springdemo2.model.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void create(Course course) {
        entityManager.persist(course);
    }

    @Transactional
    @Override
    public Course update(Course course) {
        entityManager.merge(course);
        return course;
    }

    @Override
    public Course findById(Integer id) {
        return entityManager.find(Course.class, id);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        entityManager.remove(findById(id));
    }

    @Override
    public List<Course> listAll() {
        return entityManager.createQuery("from Course").getResultList();
    }
}
