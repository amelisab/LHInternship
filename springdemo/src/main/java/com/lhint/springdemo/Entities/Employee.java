package com.lhint.springdemo.Entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "employee")
public class Employee {

        final static public String NAME = "Employee.findAll";

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "emp_no")
        private Integer empNo;

        @Column(name="birth_date")
        @Temporal(TemporalType.TIMESTAMP)
        private Date birthDate;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "gender")
        private String gender;

        @Column(name="hire_date")
        @Temporal(TemporalType.TIMESTAMP)
        private Date hireDate;

        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
        private Set<Salary> salaries = new HashSet<Salary>();

        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
        private Set<Title> titles = new HashSet<Title>();

        @ManyToMany(mappedBy = "departmentEmployees")
        private Set<Department> departmentEmloyees = new HashSet<Department>();

    public Employee() {

    }
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Employee(Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public Employee(Integer empNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
        this.setEmpNo(empNo);
        this.setBirthDate(birthDate);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
        this.setHireDate(hireDate);
    }

    public Set<Salary> getSalaries() {
        return this.salaries;
    }

    public void setSalaries(Set<Salary> salaries) {
        if (this.salaries == null){
            this.salaries = salaries;
        } else {
            this.salaries.addAll(salaries);
        }
    }

    public Set<Title> getTitles() {
        return titles;
    }

    public void setTitles(Set<Title> titles) {
        if (this.titles == null){
            this.titles = titles;
        } else {
            this.titles.addAll(titles);
        }
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


        public Integer getEmpNo() {
            return empNo;
        }

        public void setEmpNo(Integer empNo) {
            this.empNo = empNo;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }


        public Set<Department> getDepartments() {
            return departmentEmloyees;
        }

        public void setDepartments(Set<Department> departments) {
            this.departmentEmloyees = departments;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
