package com.murat.hrms.dataAccess.abstracts;

import com.murat.hrms.entities.concretes.JobAdvertisement;
import com.murat.hrms.entities.dtos.JobAdvertisementWithCompNameDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    List<JobAdvertisement> findByEmployer_Id(int compId);

    List<JobAdvertisement> findByEmployer_CompanyName(String companyName);


    @Query("select new com.murat.hrms.entities.dtos.JobAdvertisementWithCompNameDto" +
            "(j.advertisementId,a.jobName,j.vacantPos,j.applyDeadLine,j.publishingDate,e.companyName) " +
            "from Employer e inner join e.jobAds j inner join j.job a")
    List<JobAdvertisementWithCompNameDto> findWithCompName();


}
