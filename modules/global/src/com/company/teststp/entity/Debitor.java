package com.company.teststp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "TESTSTP_DEBITOR")
@Entity(name = "teststp_Debitor")
public class Debitor extends StandardEntity {
    private static final long serialVersionUID = -5638160542666596305L;
    @Column(name = "FIRSTNAME", nullable = false)
    protected String firstname;
    @Column(name = "LASTNAME")
    protected String lastname;
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;
    @Column(name = "DEBT_SUM", nullable = false, precision = 19, scale = 2)
    protected BigDecimal debt_sum;
    @Column(name = "PHONE")
    protected String phone;
    @Column(name = "ADDRESS", nullable = false)
    protected String address;
    @Column(name = "PASSPORT_NUMBER", nullable = false)
    protected String passport_number;
    @Column(name = "PASSPORT_SERIES", nullable = false)
    protected String passport_series;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DEBT_REPAYMENT_DATE", nullable = false)
    protected Date debt_repayment_date;

    public Date getDebt_repayment_date() {
        return debt_repayment_date;
    }

    public void setDebt_repayment_date(Date debt_repayment_date) {
        this.debt_repayment_date = debt_repayment_date;
    }

    public String getPassport_series() {
        return passport_series;
    }

    public void setPassport_series(String passport_series) {
        this.passport_series = passport_series;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getDebt_sum() {
        return debt_sum;
    }

    public void setDebt_sum(BigDecimal debt_sum) {
        this.debt_sum = debt_sum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}