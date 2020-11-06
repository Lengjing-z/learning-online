package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleSecurity implements Serializable {
    private static final long serialVersionUID = -18678131743840257L;

    private Integer roleId;

    private Integer securityId;

}