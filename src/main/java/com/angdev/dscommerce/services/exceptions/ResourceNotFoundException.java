package com.angdev.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg) {
        super(msg); //Chama o construtor da RunTimeException
    }
}
