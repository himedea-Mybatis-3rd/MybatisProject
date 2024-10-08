package com.naver.project1.model.dto;

public class EmployeeDTOname {

    private int empId;
    private String hireDate;
    private String deptId;
    private String deptTitle;
    private String nationalCode;
    private String nationalName;
    private String jobCode;
    private String jobName;
    private String empName;
    private String locationId;

    public EmployeeDTOname () {}

    public EmployeeDTOname(int empId, String hireDate, String deptId, String deptTitle,
                           String nationalCode, String nationalName, String jobCode,
                           String jobName, String empName, String locationId) {
        this.empId = empId;
        this.hireDate = hireDate;
        this.deptId = deptId;
        this.deptTitle = deptTitle;
        this.nationalCode = nationalCode;
        this.nationalName = nationalName;
        this.jobCode = jobCode;
        this.jobName = jobName;
        this.empName = empName;
        this.locationId = locationId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getNationalName() {
        return nationalName;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "EmployeeDTOname{" +
                "empId=" + empId +
                ", hireDate='" + hireDate + '\'' +
                ", deptId='" + deptId + '\'' +
                ", deptTitle='" + deptTitle + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", nationalName='" + nationalName + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", jobName='" + jobName + '\'' +
                ", empName='" + empName + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
