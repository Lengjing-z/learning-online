package com.zn.learningonline.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Progress implements Serializable {
    private static final long serialVersionUID = 541235008679899825L;

    private Integer clazzId;

    private Integer userId;

    private Integer coursewareId;

    private Object progressFinished;

}