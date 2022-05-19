package com.murat.hrms.business.concretes;

import com.murat.hrms.business.abstracts.JobAdvertisementService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.murat.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    private JobAdvertisementDao jobAdvertisementDao;
    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll());
    }
}
