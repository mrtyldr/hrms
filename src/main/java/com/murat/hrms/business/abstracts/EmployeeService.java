package com.murat.hrms.business.abstracts;

import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult<Employee> addEmployee(Employee employee);
    DataResult<List<Employee>> findAllEmployees();
}
