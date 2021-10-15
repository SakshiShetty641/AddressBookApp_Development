package com.bridgelabz.addressbookappdevelopment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Layer is used to pass parameter data and object
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 14/10/2021
 */
@Data
@AllArgsConstructor
public class ResponseDto {
    private String message;
    private Object data;
}
