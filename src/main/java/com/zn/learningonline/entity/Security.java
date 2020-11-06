package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Security implements Serializable {
    private static final long serialVersionUID = 434222205485272516L;

    private Integer securityId;

    private String securityName;


}