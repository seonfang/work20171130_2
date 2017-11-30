package com.example;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public class InsertService {

	@PersistenceContext(unitName="jpa_link")
	EntityManager entityManager;
	
	@Transactional
	public Employee insertEmp(long id,String name,double salary,long dept_id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDept_id(dept_id);
		System.out.println("InsertService.insertEmp(添加成功)");
		return emp;
	} 
}
