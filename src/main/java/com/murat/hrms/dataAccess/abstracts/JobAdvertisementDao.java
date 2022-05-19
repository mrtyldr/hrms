package com.murat.hrms.dataAccess.abstracts;

import com.murat.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
}
