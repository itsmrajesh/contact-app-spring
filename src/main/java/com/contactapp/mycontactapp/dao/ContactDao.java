package com.contactapp.mycontactapp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.contactapp.mycontactapp.domain.Contact;


public interface ContactDao {
	
	Contact addContact(Contact contact);
	
	List<Contact> getAllContacts();


}
