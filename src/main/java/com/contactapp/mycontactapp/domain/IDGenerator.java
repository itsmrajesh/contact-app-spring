package com.contactapp.mycontactapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IDGenerator {
	private static int count = 1;

	public static int getID() {
		return count++;
	}

}
