package com.project.dao.contact;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.dao.DatabaseConnection;
import com.project.domain.Contact;

public class ContactDAOImpl extends DatabaseConnection implements ContactDAO {
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	public void createContactTable() {
		String createTableQuery = "create table ContactList(Fname varchar(255), " + "Lname varchar(255),"
				+ "emailadd varchar(255)," + "mobile varchar(255)," + "DoB varchar(255);" + "Gender varchar(255);";

		System.out.println("Table Query: " + createTableQuery);
		getConnection();
		try {
			stmt = con.prepareStatement(createTableQuery);
			stmt.executeUpdate();
			System.out.println("Created Contact List Table");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addContact(Contact friend) {
		String addContactQuery = "insert into contacts values(?,?,?,?,?,?);";
		getConnection();
		try {
			stmt = con.prepareStatement(addContactQuery);
			stmt.setString(1, friend.getFname());
			stmt.setString(2, friend.getLname());
			stmt.setString(3, friend.getEmailadd());
			stmt.setString(4, friend.getMobilenos());
			stmt.setString(5, friend.getDob());
			stmt.setString(6, friend.getGender());
			stmt.executeUpdate();
			System.out.println("Inserted contact" + friend.getFname() + friend.getLname() + "into contact table");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	public Contact getContactbyName(String name) {
		Contact myContact=null;
		String contactQuery = "Select * from contacts where fname=?";
		getConnection();
		try {
			stmt = con.prepareStatement(contactQuery);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			rs.beforeFirst();
			while (rs.next()) {
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String email = rs.getString("emailadd");
				String mobile = rs.getString("mobile");
				String DoB = rs.getString("DoB");
				String gender = rs.getString("gender");

				myContact = new Contact(fname, lname, DoB, email, mobile, gender);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
		return myContact;
	}

	@Override
	public ArrayList<Contact> getContactList() {
		ArrayList<Contact> contactList = null;
		String contactListQuery = "Select * from contacts";
		getConnection();
		try {
			stmt = con.prepareStatement(contactListQuery);
			rs = stmt.executeQuery();
			contactList = new ArrayList<Contact>();
			while (rs.next()) {
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String email = rs.getString("emailadd");
				String mobile = rs.getString("mobile");
				String DoB = rs.getString("DoB");
				String gender = rs.getString("gender");

				Contact myContact = new Contact(fname, lname, DoB, email, mobile, gender);
				contactList.add(myContact);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		closeConnection();

		return contactList;
	}
}
