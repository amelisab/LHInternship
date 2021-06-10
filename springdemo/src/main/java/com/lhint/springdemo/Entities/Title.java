package com.lhint.springdemo.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="titles")
@IdClass(TitleId.class)
public class Title implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name="emp_no")
    private Employee employee;

    @Id
    @Column(name = "title")
    private String title;

    @Id
    @Column(name = "from_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    @Column(name = "to_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;

    public Title(Employee employee, String title, Date fromDate, Date toDate) {
        this.employee = employee;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Title(Employee employee, String title, Date fromDate) {
        this.employee = employee;
        this.title = title;
        this.fromDate = fromDate;
    }

        public Employee getEmployee() {
        return employee;
    }



    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Title{" +
                "employee=" + employee +
                ", title='" + title + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
