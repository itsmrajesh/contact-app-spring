package com.contactapp.mycontactapp.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class IDGenerator {
	private int count = 1;

	public int getID() {
		return count++;
	}
}
