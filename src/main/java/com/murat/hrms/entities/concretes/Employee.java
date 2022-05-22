package com.murat.hrms.entities.concretes;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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

    @Column(name = "first_name")
    @NotNull
    @NotBlank
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    @NotBlank
    private String lastName;

    @Column(name = "nationality_num",unique = true)
    @NotNull
    @NotBlank
    private String nationalityNum;

    @Column(name = "date_of_birth")
    @NotNull
    @NotBlank
    private Date dateOfBirth;


}
