package com.lhint.springdemo.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SalaryId implements Serializable {

    private Employee employee;

    private Date fromDate;

    public SalaryId(){}

    public SalaryId(Employee employee, Date fromDate) {
        this.employee = employee;
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryId salaryId = (SalaryId) o;
        if (employee.getEmpNo() == salaryId.employee.getEmpNo() && fromDate.compareTo(salaryId.fromDate) == 0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return employee.getEmpNo() == salaryId.employee.getEmpNo() && fromDate.compareTo(salaryId.fromDate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, fromDate);
    }
}
