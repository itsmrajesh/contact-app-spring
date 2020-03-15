package com.contactapp.mycontactapp.domain;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Contact {

	private String name;
	private String number;
	private int id;

	@Autowired
	private IDGenerator idGenerator;

	public void displayContact() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Number : " + number);
		System.out.println("----------------");
	}

	public Contact(String name, String number) {
		super();
		this.id = idGenerator.getID();
		this.name = name;
		this.number = number;
	}

}
