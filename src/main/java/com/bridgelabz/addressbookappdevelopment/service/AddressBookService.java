package com.bridgelabz.addressbookappdevelopment.service;

import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDto;
import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import com.bridgelabz.addressbookappdevelopment.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    /**
     * Function to get the list of address stored in database
     * @return list of address
     */
    public List<AddressBook> addressBookList() {
        return addressBookRepository.findAll();
    }

    /**
     * Function to add new address to the database
     * @param addressBookDto address data from client
     * @return address added
     */
    public AddressBook addAddress(AddressBookDto addressBookDto) {
        AddressBook addressBook = new AddressBook();
        addressBook.setName(addressBookDto.getName());
        addressBook.setAddress(addressBookDto.getAddress());
        addressBook.setPhoneNumber(addressBookDto.getPhoneNumber());
        return addressBookRepository.save(addressBook);
    }

    /**
     * Function to update the available address in the database
     * @param id unique id of the person whose address is stored in db
     * @param addressBookDto data from client
     * @return updated address
     */
    public AddressBook updateAddress(int id, AddressBookDto addressBookDto) {
        Optional<AddressBook> addressBook = addressBookRepository.findById(id);
        if (addressBook.isPresent()) {
            AddressBook address = addressBook.get();
            address.setName(addressBookDto.getName());
            address.setAddress(addressBookDto.getAddress());
            address.setPhoneNumber(addressBookDto.getPhoneNumber());
            return addressBookRepository.save(address);
        }
        return null;
    }

    /**
     * Function to get a particular address from database and delete it
     * @param id unique id of the person whose address is stored in db
     * @return String message displaying status of operation
     */
    public String deleteAddress(int id) {
        Optional<AddressBook> addressBook = addressBookRepository.findById(id);
        if (addressBook.isPresent()) {
            addressBookRepository.delete(addressBook.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }
}
