package com.naver.project1.model.dto;

public class EmployeeDTOGyunam {

    private int empId;
    private String jobCode;
    private String NationalCode;
    private String depId;

    private int phone;
    private int salary;
    private String empName;
    private String deptTitle;
    private String locationId;
    private String NationalName;
    private String jobName;

    public EmployeeDTOGyunam () {}

    public EmployeeDTOGyunam(int empId, int phone, int salary, String empName,
                             String depId, String deptTitle, String locationId,
                             String nationalCode, String nationalName, String jobCode, String jobName) {
        this.empId = empId;
        this.phone = phone;
        this.salary = salary;
        this.empName = empName;
        this.depId = depId;
        this.deptTitle = deptTitle;
        this.locationId = locationId;
        NationalCode = nationalCode;
        NationalName = nationalName;
        this.jobCode = jobCode;
        this.jobName = jobName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepTitle() {
        return deptTitle;
    }

    public void setDepTitle(String depTitle) {
        this.deptTitle = depTitle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getNationalCode() {
        return NationalCode;
    }

    public void setNationalCode(String nationalCode) {
        NationalCode = nationalCode;
    }

    public String getNationalName() {
        return NationalName;
    }

    public void setNationalName(String nationalName) {
        NationalName = nationalName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "EmployeeDTOGyunam{" +
                "empId=" + empId +
                ", phone=" + phone +
                ", salary=" + salary +
                ", empName='" + empName + '\'' +
                ", depId='" + depId + '\'' +
                ", depTitle='" + deptTitle + '\'' +
                ", locationId='" + locationId + '\'' +
                ", NationalCode='" + NationalCode + '\'' +
                ", NationalName='" + NationalName + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}

