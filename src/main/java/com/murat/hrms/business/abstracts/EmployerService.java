package com.murat.hrms.business.abstracts;

import com.murat.hrms.core.utilities.results.DataResult;

import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
        DataResult<List<Employer>> findAllEmployers();

        DataResult<Employer> addCompany(Employer employer);
}
