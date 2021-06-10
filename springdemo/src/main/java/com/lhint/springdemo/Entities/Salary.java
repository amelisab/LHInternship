package com.lhint.springdemo.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="salaries")
@IdClass(SalaryId.class)
public class Salary implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="emp_no")
    private Employee employee;

    @Column(name="salary")
    private Integer salary;

    @Id
    @Column(name="from_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    @Column(name="to_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;


    public Salary(Integer salary, Date fromDate, Date toDate) {
        this.salary = salary;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Salary(Integer salary, Date fromDate) {
        this.salary = salary;
        this.fromDate = fromDate;
    }

    public Salary(){}


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
