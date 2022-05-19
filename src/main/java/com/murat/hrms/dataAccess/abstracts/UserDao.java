package com.murat.hrms.dataAccess.abstracts;

import com.murat.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
