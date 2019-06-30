package com.project.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.contact.ContactDAO;
import com.project.dao.contact.ContactDAOImpl;
import com.project.domain.Contact;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/addContact")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("DOB");
		
		Contact mycontact=new Contact(fname,lname,dob,email,mobile,gender);
		ContactDAO cdao=new ContactDAOImpl();
		cdao.addContact(mycontact);
		
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
	
	}

}

