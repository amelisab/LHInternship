package com.lhint.springdemo.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO
    @Column(name="dept_no")
    private Integer deptNo;

    @Column(name="dept_name")
    private String deptName;


    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "dept_emp",
            joinColumns = {@JoinColumn(name="dept_no", referencedColumnName = "dept_no")},
            inverseJoinColumns = {@JoinColumn(name = "emp_no", referencedColumnName = "emp_no")}
    )
    private Set<Employee> departmentEmployees = new HashSet<Employee>();

    public Set<Employee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void setDepartmentEmployees(Set<Employee> departmentEmployees) {
        this.departmentEmployees = departmentEmployees;
    }

    public Department(){}

    public Department(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Department(Integer deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
