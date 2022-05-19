package com.murat.hrms.business.abstracts;

import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.Employee;
import com.murat.hrms.entities.concretes.Employer;
import com.murat.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {



    DataResult<List<User>> findAll();

    DataResult<Employer> addCompany(Employer employer);



}
