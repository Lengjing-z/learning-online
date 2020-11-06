package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Batch implements Serializable {
    private static final long serialVersionUID = 777745325788606170L;

    private Integer batchId;

    private String batchName;

    private Date batchStarttime;

    private Date batchEndtime;

}