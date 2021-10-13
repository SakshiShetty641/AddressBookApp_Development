package com.bridgelabz.addressbookappdevelopment.service;

import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDto;
import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import com.bridgelabz.addressbookappdevelopment.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Layer contains business logic,
 * It implements all the methods in controller layer
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    public AddressBook addAddress(AddressBookDto addressBookDto) {
        return null;
    }

    public AddressBook updateAddress(int id, AddressBookDto addressBookDto) {
        return null;
    }

    public String deleteAddress(int id) {
        return null;
    }
}
