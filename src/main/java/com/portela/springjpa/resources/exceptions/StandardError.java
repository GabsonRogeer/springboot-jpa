package com.portela.springjpa.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
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
