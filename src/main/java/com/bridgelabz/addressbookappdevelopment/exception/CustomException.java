package com.bridgelabz.addressbookappdevelopment.exception;

/**
 * Layer is used to create own Exceptions
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 14/10/2021
 */

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
