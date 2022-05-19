package com.murat.hrms.business.abstracts;

import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.JobAdvertisement;
import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> findAll();
}
