package com.murat.hrms.entities.concretes;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_ads")
//@JsonIgnoreProperties()
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private int advertisementId;

    /*@Column(name = "job_name")
    @NotNull
    private String jobName;*/

    @Column(name = "job_definition")
    @NotNull
    private String jobDefinition;

    @Column(name = "city")
    @NotNull
    private String city;

    @Column(name = "expected_salary")
    private String expSalary;

    @Column(name = "vacant_pos")
    @NotNull
    private int vacantPos;

    @Column(name = "apply_deadline")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date applyDeadLine;

    @Column(name = "publish_date")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date publishingDate;


    @ManyToOne(optional = false)
    @JoinColumn(name = "comp_id",referencedColumnName = "employer_id")
    private Employer employer;

    @OneToMany(mappedBy ="jobAdvertisement",fetch = FetchType.LAZY)
    private List<Job> job;

}
