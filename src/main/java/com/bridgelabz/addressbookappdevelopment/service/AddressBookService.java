package com.bridgelabz.addressbookappdevelopment.service;

import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDto;
import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import com.bridgelabz.addressbookappdevelopment.repository.AddressBookRepository;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

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
        modelMapper.map(addressBookDto, addressBook);
        return addressBookRepository.save(addressBook);
    }

    /**
     * Function to get a particular address stored in database
     * @param id unique id of the address in database
     * @return required address
     */
    public AddressBook findAddressById(int id) {
        Optional<AddressBook> address = addressBookRepository.findById(id);
        if (address.isPresent()) {
            return address.get();
        }
        return null;
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
            modelMapper.map(addressBookDto, address);
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
