package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 414527792998151372L;

    private Integer roleId;

    private String roleName;


}