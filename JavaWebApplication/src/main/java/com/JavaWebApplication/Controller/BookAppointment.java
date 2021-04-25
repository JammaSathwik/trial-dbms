package com.JavaWebApplication.Controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplication.Beans.DoctorBean;
import com.JavaWebApplication.Model.UserDb;

/**
 * Servlet implementation class BookAppointment
 */
public class BookAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookAppointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		HttpSession session = request.getSession();
		String pat_name = (String) session.getAttribute("Name");
		PrintWriter out = response.getWriter();
		String category = request.getParameter("category");
		String appointment = request.getParameter("appointment");
		String slot = request.getParameter("slot");
		out.write("   ");
		out.write(category);
		out.write("   ");
		out.write(appointment);
		out.write("   ");
		out.write(slot);
		out.write("   ");
		out.write(pat_name);
		
		UserDb u =new UserDb();
		String s9 = u.Bookapt(category,pat_name,appointment,slot);
		out.write(" ");
		out.write(s9);
		
		/*
		DoctorBean db = new DoctorBean(category,appointment,slot);
		db.setAppointment(appointment);
		db.setCategory(category);
		db.setSlot(slot);*/
		//UserDb u = new UserDb();
		
	}
}