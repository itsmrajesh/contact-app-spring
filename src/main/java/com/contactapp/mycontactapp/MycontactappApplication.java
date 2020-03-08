package com.contactapp.mycontactapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.contactapp.mycontactapp.dao.ContactDao;
import com.contactapp.mycontactapp.domain.Contact;

@SpringBootApplication
public class MycontactappApplication implements CommandLineRunner {

	@Autowired
	private Contact contact;

	@Autowired
	@Qualifier("mydao")
	private ContactDao dao;

	public static void main(String[] args) {
		SpringApplication.run(MycontactappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		contact.setName("Rajesh");
		contact.setNumber("9483685398");
		dao.addContact(contact);
		contact.setName("Ramesh");
		contact.setNumber("9483685399");
		dao.addContact(contact);
		contact.setName("Rakesh");
		contact.setNumber("9483685310");
		dao.addContact(contact);

		List<Contact> list = dao.getAllContacts();

		System.out.println(list);

	}

}
