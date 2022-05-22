package com.murat.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "employer_id")
@DiscriminatorValue("C")
@JsonIgnoreProperties("jobAds")
public class Employer extends User {

    @Column(name = "company_name",unique = true)
    @NotNull
    @NotBlank
    private String companyName;

    @Column(name = "company_domain",unique = true)
    @NotNull
    @NotBlank
    private String companyDomain;

    @Column(name = "phone_number",unique = true)
    @NotNull
    @NotBlank
    private String phoneNumber;

    @OneToMany(mappedBy = "employer",fetch = FetchType.LAZY)
    private List<JobAdvertisement> jobAds;

}
