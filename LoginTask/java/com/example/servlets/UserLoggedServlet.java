package com.example.servlets;

import java.util.ArrayList;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.MainDao;
import com.example.types.*;


public class UserLoggedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserLoggedServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MainDao mainDao=new MainDao();
		String string=request.getParameter("itemName");
		System.out.println(string);
		boolean flag=mainDao.AddItem(string);
		System.out.println(flag);
		if(flag) {
	          response.sendRedirect("userLogged.jsp"); //error page 
		}
    }  
		 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        doGet(request, response);	
	}

}
