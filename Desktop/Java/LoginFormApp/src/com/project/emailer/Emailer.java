package com.project.emailer;

import java.util.Properties;

import com.project.domain.Contact;

public interface Emailer {
public void sendBdayEmail(Contact contact);
}