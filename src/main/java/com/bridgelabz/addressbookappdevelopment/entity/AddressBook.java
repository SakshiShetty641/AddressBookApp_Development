package com.bridgelabz.addressbookappdevelopment.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Layer that contains the entities in the database
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@Data
@Entity
public class AddressBook {
    @Id
    private int id;
    private String name;
    private String address;
}
