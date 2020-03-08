package com.contactapp.mycontactapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.contactapp.mycontactapp.domain.Contact;

@Component("mydao")
public class ContactDaoImpl implements ContactDao {

	private List<Contact> contacts = new ArrayList<>();

	@Override
	public Contact addContact(Contact contact) {
		contacts.add(contact);
		return contact;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contacts;
	}

}
