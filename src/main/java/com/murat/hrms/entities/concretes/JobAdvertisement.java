package com.murat.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_ad")
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private int advertisementId;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_definition")
    private String jobDefinition;

    @Column(name = "city")
    private String city;

    @Column(name = "expected_salary")
    private String expSalary;

    @Column(name = "vacant_pos")
    private int vacantPos;

    @ManyToOne
    @JoinColumn(name = "job_ads")
    private Employer employer;

}
