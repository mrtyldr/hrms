package com.murat.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "jobs")
@JsonIgnoreProperties("jobAdvertisement")
public class Job {

    @Id
    @Column(name = "job_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;

    @Column(name = "job_name")
    @NotNull
    @NotBlank
    private String jobName;


    @ManyToOne
    @JoinColumn(name = "job_id",insertable = false,updatable = false)
    private JobAdvertisement jobAdvertisement;
}
