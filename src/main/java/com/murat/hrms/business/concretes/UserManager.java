package com.murat.hrms.business.concretes;

import com.murat.hrms.business.abstracts.UserService;
import com.murat.hrms.core.utilities.checkServices.EmployerCheckService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.ErrorDataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.dataAccess.abstracts.UserDao;
import com.murat.hrms.entities.concretes.Employee;
import com.murat.hrms.entities.concretes.Employer;
import com.murat.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {
    private UserDao userDao;
    private EmployerCheckService employerCheckService;
    @Autowired
    public UserManager(UserDao userDao, EmployerCheckService employerCheckService) {
        this.userDao = userDao;
        this.employerCheckService = employerCheckService;
    }


    @Override
    public DataResult<List<User>> findAll() {
        return new SuccessDataResult<>(this.userDao.findAll());
    }

    @Override
    public DataResult<Employer> addCompany(Employer employer) {
        if(this.employerCheckService.checkEmail(employer)){
            return new SuccessDataResult<>(this.userDao.save(employer),"Employer has succesfully been added");
        }
        return new ErrorDataResult<>(employer,"Something went wrong");
    }
}
