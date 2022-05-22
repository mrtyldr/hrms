package com.murat.hrms.business.concretes;

import com.murat.hrms.business.abstracts.JobAdvertisementService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.murat.hrms.entities.concretes.Employer;
import com.murat.hrms.entities.concretes.JobAdvertisement;
import com.murat.hrms.entities.dtos.JobAdvertisementWithCompNameDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

    @Override
    public DataResult<JobAdvertisement> addJobAdvertisement(JobAdvertisement jobAdvertisement) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.save(jobAdvertisement));
    }

    public DataResult<List<JobAdvertisement>> findByCompId(int compId){
        return new SuccessDataResult<>(this.jobAdvertisementDao.findByEmployer_Id(compId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> findByCompName(String compName) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findByEmployer_CompanyName(compName));
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllSortedByDate() {
        Sort sort = Sort.by(Sort.Direction.ASC,"publishingDate");
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll(sort));
    }

    @Override
    public DataResult<List<JobAdvertisementWithCompNameDto>> findWithCompName() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findWithCompName());
    }
}
