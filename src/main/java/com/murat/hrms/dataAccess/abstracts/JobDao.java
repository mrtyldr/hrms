package com.murat.hrms.dataAccess.abstracts;

import com.murat.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {
}
