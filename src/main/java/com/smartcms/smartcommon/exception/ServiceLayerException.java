package com.smartcms.smartcommon.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ServiceLayerException extends RuntimeException {

    private final HttpStatus status;

    public ServiceLayerException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public ServiceLayerException(String message, Throwable cause, HttpStatus status) {
        super(message, cause);
        this.status = status;
    }

    public ServiceLayerException(Throwable cause, HttpStatus status) {
        super(cause);
        this.status = status;
    }
}
