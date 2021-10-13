package com.bridgelabz.addressbookappdevelopment.repository;

import com.bridgelabz.addressbookappdevelopment.entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Layer that implements interface and does the database operations
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {
}
