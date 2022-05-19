package com.murat.hrms.business.abstracts;

import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    DataResult<List<Job>> findall();

    DataResult<Job> addJobPosition(Job job);
}
