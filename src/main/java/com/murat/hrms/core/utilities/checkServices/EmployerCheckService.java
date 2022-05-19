package com.murat.hrms.core.utilities.checkServices;

import com.murat.hrms.entities.concretes.Employer;

public interface EmployerCheckService {
    boolean checkEmail(Employer employer);
}
