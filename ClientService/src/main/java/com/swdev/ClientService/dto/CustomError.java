package com.swdev.ClientService.dto;

import java.time.Instant;

public class CustomError {
    public Instant timesstamp;
    public Integer status;
    public String error;
    public String path;

    public CustomError(Instant timesstamp, Integer status, String error, String path) {
        this.timesstamp = timesstamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }


    public Instant getTimesstamp() {
        return timesstamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }
}
