package com.contactapp.mycontactapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactapp.mycontactapp.dao.ContactDao;
import com.contactapp.mycontactapp.domain.Contact;

@RestController
@RequestMapping("api/capp/")
public class ContactController {

	@Autowired
	private ContactDao dao;

	@PostMapping("/addcontact")
	public Contact addContact(@RequestBody Contact contact) {
		return dao.addContact(contact);
	}

	@GetMapping("/getcontact/{name}")
	public Contact getContact(@PathVariable String name) {
		List<Contact> list = dao.getAllContacts();
		for (Contact c : list) {
			if (c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		return null;
	}

	@GetMapping("/getallcontacts")
	public List<Contact> getAllContacts() {
		return dao.getAllContacts();
	}

}
