package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Curriculum implements Serializable {
    private static final long serialVersionUID = 184873141082046187L;

    private Integer curriculumId;

    private String curriculumName;

    private Integer userId;

    private String curriculumDescription;


}