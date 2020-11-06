package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Courseware implements Serializable {
    private static final long serialVersionUID = 336507785466955650L;

    private Integer coursewareId;

    private Integer coursewareDescription;

    private Integer chapterId;

    private String title;

    private Integer filetypeId;

}