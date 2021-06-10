package com.lhint.springdemo.repository;


import com.lhint.springdemo.Entities.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@PersistenceContext
	private EntityManager entityManager;


	public EmployeeRepositoryImpl() {

	}

	@Transactional
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
	}

	@Transactional
	public void deleteEmployee(Integer id) {
		entityManager.remove(findById(id));
	}

	public List<Employee> listAll() {
		return entityManager.createQuery("from Employee").getResultList();
	}

	@Transactional
	public Employee update(Employee employee){
		entityManager.merge(employee);

		return employee;
	}

	public Employee findById(Integer id) {
		return entityManager.find(Employee.class, id);
//		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.getFirstName = ?1", Employee.class);
//		query.setParameter(1, id);
//		return query.getSingleResult();
	}
}
