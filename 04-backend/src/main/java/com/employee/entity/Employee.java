package com.employee.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="employee_details")

public class Employee {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "role")

    private String role;
    @Column(name = "computer_access")
    private String computerAccess;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "headset")
    private String headset;
    @Column(name = "work_from_home")
    private String workFromHome;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getComputerAccess() {
        return computerAccess;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getHeadset() {
        return headset;
    }

    public String getWorkFromHome() {
        return workFromHome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setComputerAccess(String computerAccess) {
        this.computerAccess = computerAccess;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setHeadset(String headset) {
        this.headset = headset;
    }

    public void setWorkFromHome(String workFromHome) {
        this.workFromHome = workFromHome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(role, employee.role) &&
                Objects.equals(computerAccess, employee.computerAccess) &&
                Objects.equals(branchName, employee.branchName) &&
                Objects.equals(headset, employee.headset) &&
                Objects.equals(workFromHome, employee.workFromHome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, role, computerAccess, branchName, headset, workFromHome);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", computerAccess='" + computerAccess + '\'' +
                ", branchName='" + branchName + '\'' +
                ", headset='" + headset + '\'' +
                ", workFromHome='" + workFromHome + '\'' +
                '}';
    }
}
