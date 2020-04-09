package com.cognizant.employee.entity;


import lombok.Data;

import javax.persistence.*;

@Entity

@Table(name = "employee_details")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


}
