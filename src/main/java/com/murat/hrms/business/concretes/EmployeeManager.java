package com.murat.hrms.business.concretes;

import com.murat.hrms.core.utilities.checkServices.EmployeeCheckService;
import com.murat.hrms.business.abstracts.EmployeeService;
import com.murat.hrms.core.utilities.adapters.EmailVerificationService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.ErrorDataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.dataAccess.abstracts.EmployeeDao;
import com.murat.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeeDao;
    private EmployeeCheckService employeeCheckService;

    private EmailVerificationService emailVerificationService;
    @Autowired
    public EmployeeManager(EmployeeDao employeeDao, EmployeeCheckService employeeCheckService, EmailVerificationService emailVerificationService) {
        this.employeeDao = employeeDao;
        this.employeeCheckService = employeeCheckService;
        this.emailVerificationService = emailVerificationService;
    }


    @Override
    public DataResult<Employee> addEmployee(Employee employee) {
        if(employeeCheckService.checkIfReal(employee) && employeeCheckService.emailCheck(employee) && emailVerificationService.isVerificationSuccess()){
            return new SuccessDataResult<>(this.employeeDao.save(employee),"User hase successfully been added to system");
        }
        else{
            return new ErrorDataResult<>(employee,"Something went wrong");
        }
    }

    @Override
    public DataResult<List<Employee>> findAllEmployees() {
        return new SuccessDataResult<>(this.employeeDao.findAll());
    }
}
