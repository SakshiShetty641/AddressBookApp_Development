package com.bridgelabz.addressbookappdevelopment.controller;

import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDto;
import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import com.bridgelabz.addressbookappdevelopment.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.List;

/**
 * Layer that receives various HTTP request from client
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */


@RequestMapping("/Api")
@RestController
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    /**
     * Function to get mapping from client
     * @return List of address
     */
    @GetMapping("/address")
    public List<AddressBook> addressBookList() {
        return addressBookService.addressBookList();
    }

    /**
     * Function to receive get request from client
     * @param addressBookDto address data from client
     * @return added address in the database
     */
    @PostMapping("/add-address")
    public AddressBook addAddress(@RequestBody AddressBookDto addressBookDto){
        return addressBookService.addAddress(addressBookDto);
    }

    /**
     * Function to receive get request from client
     * @param id unique id of the address
     * @return required address
     */
    @GetMapping("/find-by-id")
    public AddressBook findAddressById(@RequestParam int id){
        return addressBookService.findAddressById(id);
    }

    /**
     * Function to receive put request from client
     * @param id - unique id of the person whose address is stored in db
     * @param addressBookDto address data from client
     * @return updated address
     */
    @PutMapping("/update-address/{id}")
    public AddressBook updateAddress(@PathVariable int id, @RequestBody AddressBookDto addressBookDto){
        return addressBookService.updateAddress(id, addressBookDto);
    }

    /**
     * Function to receive delete request from client
     * @param id unique id of the person whose address is stored in db
     * @return String message displaying status of operation
     */
    @DeleteMapping("/delete-address")
    public String deleteAddress(@RequestParam int id) {
        return addressBookService.deleteAddress(id);
    }
}
