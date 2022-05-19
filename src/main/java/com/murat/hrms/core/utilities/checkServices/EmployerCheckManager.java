package com.murat.hrms.core.utilities.checkServices;

import com.murat.hrms.dataAccess.abstracts.EmployerDao;
import com.murat.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

@Service
public class EmployerCheckManager implements EmployerCheckService{
    EmployerDao employerDao;

    public EmployerCheckManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public boolean checkEmail(Employer employer) {
        String email = employer.getEmail().substring(employer.getEmail().indexOf("@") + 1);
        String domain = employer.getCompanyDomain();
        return this.employerDao.findByEmail(employer.getEmail()) == null && email.equals(domain);
    }
}
