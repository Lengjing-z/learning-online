package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 592791480698751876L;

    private Integer userId;

    private String password;

    private String userName;

    private String code;

    private String sex;

    private Integer age;

    private List<Role> roleList;

}