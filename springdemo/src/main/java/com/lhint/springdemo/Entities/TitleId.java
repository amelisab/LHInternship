package com.lhint.springdemo.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class TitleId implements Serializable {

    private Employee employee;

    private String title;

    private Date fromDate;

    public TitleId (Employee employee, String title, Date fromDate){
        this.employee=employee;
        this.title = title;
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleId titleId = (TitleId) o;
        return Objects.equals(employee, titleId.employee) && Objects.equals(title, titleId.title) && Objects.equals(fromDate, titleId.fromDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, title, fromDate);
    }
}
