package com.mycompany.customerexception;

public class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
