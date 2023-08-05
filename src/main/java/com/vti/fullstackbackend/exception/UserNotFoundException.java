package com.vti.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Not found the user with id " + id);
    }
}
