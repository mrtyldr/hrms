package com.murat.hrms.core.utilities.adapters;


import org.springframework.stereotype.Service;

@Service
public class EmailVerificationManager implements EmailVerificationService{

    @Override
    public boolean isVerificationSuccess() {
        return true;
    }
}
