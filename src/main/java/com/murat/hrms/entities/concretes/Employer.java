package com.murat.hrms.entities.concretes;


import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "employer_id")
@DiscriminatorValue("C")
public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_domain")
    private String companyDomain;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "")
    private List<JobAdvertisement> jobAds;

}
