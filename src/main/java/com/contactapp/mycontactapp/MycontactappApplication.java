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
	private ContactDao dao;

	public static void main(String[] args) {
		SpringApplication.run(MycontactappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Contact c1 = new Contact("Lakshman", "7485967485");
		Contact c2 = new Contact("Rajesh", "7485415240");
		dao.addContact(c1);
		dao.addContact(c2);

		List<Contact> list = dao.getAllContacts();

		for (Contact c : list)
			c.displayContact();

	}

}
