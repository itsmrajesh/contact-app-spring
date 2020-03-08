package com.contactapp.mycontactapp.domain;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contact {
	
	private String name;
	private String number;
	
	
	public void displayContact() {
		System.out.println("Name : "+name);
		System.out.println("Number : "+number);
		System.out.println("----------------");
	}


	public Contact() {
		// TODO Auto-generated constructor stub
	}

}
