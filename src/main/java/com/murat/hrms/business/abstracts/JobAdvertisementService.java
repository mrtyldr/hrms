package com.murat.hrms.business.abstracts;

import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.JobAdvertisement;
import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> findAll();

    DataResult<JobAdvertisement> addJobAdvertisement(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisement>> findByCompId(int compId);

    DataResult<List<JobAdvertisement>> findByCompName(String compName);

    DataResult<List<JobAdvertisement>> findAllSortedByDate();
}
