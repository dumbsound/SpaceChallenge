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
import com.project.emailer.Emailer;
import com.project.emailer.EmailerImpl;

/**
 * Servlet implementation class SendBirthdayEmailServlet
 */
@WebServlet("/sendBirthdayEmail")
public class SendBirthdayEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendBirthdayEmailServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		System.out.println("looking for: " + fname);
		ContactDAO cdao=new ContactDAOImpl();
		Contact mycontact=cdao.getContactbyName(fname);
		System.out.println(mycontact.toString());
		Emailer em=new EmailerImpl();
		em.sendBdayEmail(mycontact);
		RequestDispatcher rd=request.getRequestDispatcher("ContactListing.jsp");
		rd.forward(request, response);
		
	}

}
