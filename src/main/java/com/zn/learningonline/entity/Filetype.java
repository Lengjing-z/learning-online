package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Filetype implements Serializable {
    private static final long serialVersionUID = -80898286482646530L;

    private Integer filetypeId;

    private String filetypeName;

    private String filetypeDescription;

}