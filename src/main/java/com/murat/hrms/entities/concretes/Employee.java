package com.murat.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "employee_id")
@DiscriminatorValue("E")
public class Employee extends User{
    //@Id
    //@Column(name = "employee_id")
    //private int employee_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_num")
    private String nationalityNum;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;


    //@OneToOne
    //private User user;

}
