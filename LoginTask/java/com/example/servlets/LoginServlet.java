package com.example.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.dao.MainDao;
import com.example.types.User;
import javax.servlet.RequestDispatcher;


public class LoginServlet extends HttpServlet {


public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {

try
{	    
	MainDao mainDao=new MainDao();
     User user = new User();
     user.setUsername(request.getParameter("username"));
     user.setPassword(request.getParameter("password"));

     user = mainDao.login(user);
	   		    
     if (user!=null)
     {
         RequestDispatcher dispatcher=request.getRequestDispatcher("userLogged.jsp");  		
         dispatcher.forward(request, response);
     }
	        
     else 
          response.sendRedirect("invalidLogin.jsp"); //error page 
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
  }
	
}
