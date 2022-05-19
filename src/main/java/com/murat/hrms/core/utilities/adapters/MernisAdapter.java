package com.murat.hrms.core.utilities.adapters;


import com.murat.hrms.core.utilities.checkServices.EmployeeCheckService;
import com.murat.hrms.dataAccess.abstracts.EmployeeDao;
import com.murat.hrms.entities.concretes.Employee;
import org.springframework.stereotype.Service;



@Service
public class MernisAdapter implements EmployeeCheckService {

    EmployeeDao employeeDao;

    public MernisAdapter(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public boolean checkIfReal(Employee employee) {
        return true;
    }

    @Override
    public boolean emailCheck(Employee employee) {
        return this.employeeDao.findByEmail(employee.getEmail()) == null;
    }
}
