package com.murat.hrms.business.concretes;

import com.murat.hrms.business.abstracts.JobService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.dataAccess.abstracts.JobDao;
import com.murat.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {
    private JobDao jobDao;
    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public DataResult<List<Job>> findall() {
        return new SuccessDataResult<>(this.jobDao.findAll());
    }

    @Override
    public DataResult<Job> addJobPosition(Job job) {
        return new SuccessDataResult<>(this.jobDao.save(job));
    }
}
