package com.murat.hrms.api.controllers;

import java.util.List;

import com.murat.hrms.business.abstracts.EmployeeService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/findall")
    DataResult<List<Employee>> findAllEmployees(){
        return this.employeeService.findAllEmployees();
    }

    @PostMapping("/employee/add")
    DataResult<Employee> addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }
}
