package com.luxoft.vowelscounttask.exception;

public class ServiceExceptions extends Exception {
    public ServiceExceptions() {
        super();
    }

    public ServiceExceptions(String message) {
        super(message);
    }

    public ServiceExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceExceptions(Throwable cause) {
        super(cause);
    }

    protected ServiceExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
