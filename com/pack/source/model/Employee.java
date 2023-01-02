package com.pack.source.model;

import java.util.Date;

public class Employee {

    private String employeeId;
    private long employeeSalary;
    private int employeeAge;
    private Date employeeJoiningDate;

    public Employee(String employeeId, long employeeSalary, int employeeAge, Date employeeJoiningDate) {
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.employeeJoiningDate = employeeJoiningDate;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeSalary=" + employeeSalary + ", employeeAge="
                + employeeAge + ", employeeJoiningDate=" + employeeJoiningDate + "]";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Date getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }

    public void setEmployeeJoiningDate(Date employeeJoiningDate) {
        this.employeeJoiningDate = employeeJoiningDate;
    }

}
