package com.murat.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Date;


@Data
@AllArgsConstructor
public class JobAdvertisementWithCompNameDto {

    private int advertisementId;
    private String jobName;
    private int vacantPos;
    private Date applyDeadLine;
    private Date publishingDate;
    private String companyName;


}
