package com.project.dao.contact;

import com.project.domain.Contact;

public class Test {
	
	public static void main(String[] args) {
		

	
	ContactDAOImpl cdao=new ContactDAOImpl();
	Contact c2=new Contact("ali","White", "15-01-88", "ali@abc.net", "8186087", "m");
	cdao.addContact(c2);
	
	System.out.println("test worked");

}
}