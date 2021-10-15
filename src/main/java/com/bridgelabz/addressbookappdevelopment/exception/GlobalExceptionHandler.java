package com.bridgelabz.addressbookappdevelopment.exception;

import com.bridgelabz.addressbookappdevelopment.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Layer is used to handle uncaught runtime exceptions
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 14/10/2021
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ResponseDto> handleCustomException(CustomException customException) {
        return new ResponseEntity<>(new ResponseDto(customException.getMessage(), null), HttpStatus.BAD_REQUEST);
    }
}

