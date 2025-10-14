package com.spring.boot.pipeline.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {

        super(id+ " not found");

    }
}