package com.reznichenko.repository;

import com.reznichenko.domain.Contact;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
 
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long>, 
        JpaSpecificationExecutor<Contact> {
}