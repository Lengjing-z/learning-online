package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Chapter implements Serializable {
    private static final long serialVersionUID = -75498206257452041L;

    private Integer chapterId;

    private String chapterName;

    private String chapterCode;

    private String chapterDescription;

    private Integer curriculumId;


}