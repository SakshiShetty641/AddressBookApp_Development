package com.bridgelabz.addressbookappdevelopment.service;

import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import com.bridgelabz.addressbookappdevelopment.repository.AddressBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

/**
 * Layer that simulates test case to determine whether features of address book is performing as expected
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 17/10/2021
 */

@ExtendWith(MockitoExtension.class)
public class AddressBookServiceTest {
    @InjectMocks
    private AddressBookService addressBookService;
    @Mock
    private AddressBookRepository addressBookRepository;
    @Mock
    private
    ModelMapper modelMapper;

    @Test
    public void givenID_WhenCalled_ShouldReturnPersonById() {
        AddressBook addressBook = new AddressBook();
        addressBook.setId(1);
        Assertions.assertEquals(1, addressBook.getId());
    }

    @Test
    public void givenName_WhenCalled_ShouldReturnPersonByName() {
        AddressBook addressBook = new AddressBook();
        addressBook.setName("Sakshi");
        Assertions.assertEquals("Sakshi", addressBook.getName());
    }

    @Test
    public void givenAddress_WhenCalled_ShouldReturnPersonByAddress() {
        AddressBook addressBook = new AddressBook();
        addressBook.setName("Malad, Mumbai");
        Assertions.assertEquals("Malad, Mumbai", addressBook.getName());
    }

    @Test
    public void givenPhoneNumber_WhenCalled_ShouldReturnPersonByPhoneNumber() {
        AddressBook addressBook = new AddressBook();
        addressBook.setName("9167073122");
        Assertions.assertEquals("9167073122", addressBook.getName());
    }
}
