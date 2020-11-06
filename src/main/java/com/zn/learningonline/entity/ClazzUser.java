package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClazzUser implements Serializable {
    private static final long serialVersionUID = 762345096147468920L;

    private Integer clazzId;

    private Integer userId;


}