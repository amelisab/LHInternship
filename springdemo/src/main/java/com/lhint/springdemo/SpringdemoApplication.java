package com.lhint.springdemo;

import com.lhint.springdemo.service.DepartmentServiceImpl;
import com.lhint.springdemo.service.EmployeeServiceImpl;
import com.lhint.springdemo.service.SalaryServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication{


	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);


//		StudentService ss = (StudentService) ctx.getBean("studentService");
//
//		ss.sayHello();


		DepartmentServiceImpl departmentService = (DepartmentServiceImpl) ctx.getBean("departmentServiceImpl");
		EmployeeServiceImpl employeeService = (EmployeeServiceImpl) ctx.getBean("employeeServiceImpl");
		SalaryServiceImpl salaryService = (SalaryServiceImpl) ctx.getBean("salaryServiceImpl");

//		Department d = new Department();
//		d.setDeptName("DemoDepartment");
//		departmentService.addDepartment(d);

		/////////////////////////////////////////////////////////////////////////////////////
//		Department d = departmentService.findById(11);
//
//		Employee e = employeeService.findById(5);
//
//		Set<Employee> employees = d.getDepartmentEmployees();
//		employees.add(e);
//		d.setDepartmentEmployees(employees);
//
//		departmentService.updateDepartment(d);

		/////////////////////////////////////////////////////////////////////////////////////

//		departmentService.deleteDepartment(3);

		////////////////////////////////////////////////////////////////////////////////////

//		try {
//			Salary salary = new Salary();
//			salary.setSalary(350000);
//			salary.setFromDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-04-01"));
//			salary.setToDate((new SimpleDateFormat("yyy-MM-dd")).parse("2023-04-01"));
//
//
//			Employee e = employeeService.findById(3);
//
//			salary.setEmployee(e);
//
//			//use update because else it gives detached entity passed to persist bc when using Cascade.ALL it tries to
//			//persist also the Employee
//			salaryService.updateSalary(salary);
//		}catch (ParseException e) {
//			e.printStackTrace();
//		}

		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		List<Salary> salarySet = salaryService.listAll();
//
//		for (Salary s : salarySet) {
//			Employee employee = s.getEmployee();
//
//			System.out.println(s.getSalary() + " " + employee.getEmpNo() + " " + employee.getFirstName());
//
//		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////

//		List<Employee> employees = employeeService.listAll();

//		for (Employee e: employees) {
//			Set<Salary> salaries = e.getSalaries();
//			System.out.println("Employee: " + " " + e.getEmpNo() + " "+ e.getFirstName());
//			System.out.println("Salaries");
//			for (Salary salary : salaries) {
//				System.out.println(salary.getSalary() + ", ");
//			}
//		}

	}

}
