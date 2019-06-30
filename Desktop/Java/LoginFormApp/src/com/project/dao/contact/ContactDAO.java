package com.project.dao.contact;

import java.util.ArrayList;

import com.project.domain.Contact;

public interface ContactDAO {
public void addContact(Contact friend);

public Contact getContactbyName(String name);

public ArrayList<Contact> getContactList();

}
