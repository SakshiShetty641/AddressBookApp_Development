package com.bridgelabz.addressbookappdevelopment.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Layer that contains data from client
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@Getter
@Setter
@Data
public class AddressBookDto {
    private String name;
    private String address;
    private long phoneNumber;

}
