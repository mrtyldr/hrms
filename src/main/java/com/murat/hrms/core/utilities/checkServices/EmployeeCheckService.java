package com.murat.hrms.core.utilities.checkServices;


import com.murat.hrms.entities.concretes.Employee;

public interface EmployeeCheckService {

  boolean checkIfReal(Employee employee);

  boolean emailCheck(Employee employee);
}
