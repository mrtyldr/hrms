package com.murat.hrms.dataAccess.abstracts;

import com.murat.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    List<JobAdvertisement> findByEmployer_Id(int compId);

    List<JobAdvertisement> findByEmployer_CompanyName(String companyName);

}
