package com.smartcms.smartcommon.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ServiceLayerException extends RuntimeException{
    private Integer statusCode;
    private String message;

    public ServiceLayerException(String message) {
        super(message);
        this.message = message;
    }

    public ServiceLayerException(Throwable cause) {
        super(cause);
        this.message = cause == null ? null : cause.toString();
    }

    public ServiceLayerException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public ServiceLayerException(HttpStatus status) {
        this.statusCode = status.value();
    }

    public ServiceLayerException(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public ServiceLayerException(Throwable cause, HttpStatus status) {
        super(cause);
        this.statusCode = status.value();
        this.message = cause == null ? null : cause.toString();
    }

    public ServiceLayerException(Throwable cause, Integer statusCode) {
        super(cause);
        this.statusCode = statusCode;
        this.message = cause == null ? null : cause.toString();
    }

    public ServiceLayerException(String message, HttpStatus status) {
        super(message);
        this.statusCode = status.value();
        this.message = message;
    }

    public ServiceLayerException(String message, Integer statusCode) {
        super(message);
        this.statusCode = statusCode;
        this.message = message;
    }

    public ServiceLayerException(String message, Throwable cause, HttpStatus status) {
        super(message, cause);
        this.statusCode = status.value();
        this.message = message;
    }

    public ServiceLayerException(String message, Throwable cause, Integer statusCode) {
        super(message, cause);
        this.statusCode = statusCode;
        this.message = message;
    }

    public ServiceLayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer statusCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.statusCode = statusCode;
        this.message = message;
    }

    public ServiceLayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, HttpStatus status) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.statusCode = status.value();
        this.message = message;
    }

}
