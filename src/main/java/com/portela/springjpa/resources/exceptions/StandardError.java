package com.portela.springjpa.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timestamp;
    private Integer status;
    private String error;
    private String messege;
    private String path;

    public StandardError(){

    }

    public StandardError(Instant timestamp,
                         Integer status,
                         String error,
                         String messege,
                         String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.messege = messege;
        this.path = path;
    }
}
