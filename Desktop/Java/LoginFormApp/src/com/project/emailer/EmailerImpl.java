package com.project.emailer;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.project.domain.Contact;

public class EmailerImpl implements Emailer {
private String createEmailMessage(String fname,String lname){
String msg="hello" +fname+"\n\n"
			+"Wishing you are happy birthday!";
return msg;
}
	
	public void sendBdayEmail(Contact contact) {
		//Recipient's email ID needs to be mentioned.
		String to = contact.getEmailadd();

		// Sender's email ID needs to be mentioned
		String from = "salehbasharahil@gmail.com";
		final String username = "salehbasharahil";//change accordingly
	      final String password = "48TG36RDn7ty";//change accordingly

		// Assuming you are sending email from localhost
		String host = "smtp.gmail.com";

		// Get system properties
		 Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");
		// Setup mail server
	      // Get the Session object.
	      Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	         }
	      });


		 try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Happy Birthy to You!"+contact.getFname()+" "+contact.getLname());

         // Now set the actual message
         message.setText(createEmailMessage(contact.getFname(),contact.getLname()));

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
	

