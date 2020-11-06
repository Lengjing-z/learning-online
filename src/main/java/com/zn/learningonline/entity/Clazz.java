package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Clazz implements Serializable {
    private static final long serialVersionUID = -38525118049940675L;

    private Integer clazzId;

    private String clazzName;

    private Integer batchId;

    private Integer curriculumId;

    private Integer clazzDescription;

}