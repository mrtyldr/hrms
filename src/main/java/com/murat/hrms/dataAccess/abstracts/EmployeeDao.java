package com.murat.hrms.dataAccess.abstracts;

import com.murat.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    Employee findByEmail(String email);

    Employee findByNationalityNum(String nationalityNum);


}
