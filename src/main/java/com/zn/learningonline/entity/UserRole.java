package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRole implements Serializable {
    private static final long serialVersionUID = 813740545765169118L;

    private Integer userId;

    private Integer roleId;


}