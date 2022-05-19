package com.murat.hrms.api.controllers;

import java.util.List;
import com.murat.hrms.business.abstracts.EmployerService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.Employer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
    private EmployerService employerService;

    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/findall")
    DataResult<List<Employer>> findAll(){
        return this.employerService.findAllEmployers();
    }

    @PostMapping("/addcompany")
    DataResult<Employer> addCompany(@RequestBody Employer employer){
       return this.employerService.addCompany(employer);
    }
}
