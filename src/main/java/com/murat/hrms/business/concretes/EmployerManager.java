package com.murat.hrms.business.concretes;

import com.murat.hrms.business.abstracts.EmployerService;
import com.murat.hrms.core.utilities.checkServices.EmployerCheckService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.ErrorDataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.dataAccess.abstracts.EmployerDao;
import com.murat.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private EmployerCheckService employerCheckService;
    @Autowired
    public EmployerManager(EmployerDao employerDao, EmployerCheckService employerCheckService) {
        this.employerDao = employerDao;
        this.employerCheckService = employerCheckService;
    }

    @Override
    public DataResult<List<Employer>> findAllEmployers() {
        return new SuccessDataResult<>(this.employerDao.findAll());
    }

    @Override
    public DataResult<Employer> addCompany(Employer employer) {
        if(this.employerCheckService.checkEmail(employer)){
            return new SuccessDataResult<>(this.employerDao.save(employer),"Employer has succesfully been added");
        }
        return new ErrorDataResult<>(employer,"Something went wrong");
    }
}
