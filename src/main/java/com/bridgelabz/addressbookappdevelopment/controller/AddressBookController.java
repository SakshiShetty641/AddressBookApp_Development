package com.bridgelabz.addressbookappdevelopment.controller;

import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDto;
import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import com.bridgelabz.addressbookappdevelopment.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Layer that receives various HTTP request from client
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@RestController
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    /**
     * Function to receive get request from client
     * @param addressBookDto address data from client
     * @return added address in the database
     */
    @PostMapping("/addAddress")
    public AddressBook addAddress(@RequestBody AddressBookDto addressBookDto){
        return addressBookService.addAddress(addressBookDto);
    }

    /**
     * Function to receive put request from client
     * @param id - unique id of the person whose address is stored in db
     * @param addressBookDto address data from client
     * @return updated address
     */
    @PutMapping("/updateAddress/{id}")
    public AddressBook updateAddress(@PathVariable int id, @RequestBody AddressBookDto addressBookDto){
        return addressBookService.updateAddress(id, addressBookDto);
    }

    /**
     * Function to receive delete request from client
     * @param id unique id of the person whose address is stored in db
     * @return String message displaying status of operation
     */
    @DeleteMapping("/deleteAddress")
    public String deleteAddress(@RequestParam int id) {
        return addressBookService.deleteAddress(id);
    }
}