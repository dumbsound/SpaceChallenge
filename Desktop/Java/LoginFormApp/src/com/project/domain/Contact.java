package com.project.domain;

public class Contact {
private String fname;
private String lname;
private String dob;
private String emailadd;
private String mobilenos;
private String gender;

public Contact() {
	
}
public Contact(String fname, String lname, String dob, String emailadd, String mobilenos, String gender) {
	this.fname = fname;
	this.lname = lname;
	this.dob = dob;
	this.emailadd = emailadd;
	this.mobilenos = mobilenos;
	this.gender = gender;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmailadd() {
	return emailadd;
}
public void setEmailadd(String emailadd) {
	this.emailadd = emailadd;
}
public String getMobilenos() {
	return mobilenos;
}
public void setMobilenos(String mobilenos) {
	this.mobilenos = mobilenos;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Contact [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", emailadd=" + emailadd + ", mobilenos="
			+ mobilenos + ", gender=" + gender + "]";
}
}
