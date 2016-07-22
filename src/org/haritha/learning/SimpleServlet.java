package org.haritha.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from Get method");
		PrintWriter writer=response.getWriter();
		String userName=request.getParameter("name");
		
		HttpSession session=request.getSession();
		
		ServletContext context=getServletContext();
		if(userName!=null){
		session.setAttribute("savedUserName", userName);
		context.setAttribute("savedContextName", userName);
		}
		writer.println("request parameter has username as "+userName);
		writer.println("session parameter has username as "+(String)session.getAttribute("savedUserName"));
		writer.println("context parameter has username as "+(String)context.getAttribute("savedContextName"));
		writer.println("init parameter has username as "+(String)this.getServletConfig().getInitParameter("defaultName"));
	}

}
