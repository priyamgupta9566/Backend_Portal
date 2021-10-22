package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ClassesDao;
import com.entity.Classes;
import com.service.ClassesService;
import java.sql.*;
/**
 * Servlet implementation class ClassesController
 */
public class ClassesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter pw = response.getWriter();
//		ClassesService cer = new ClassesService();
//		List<Classes> listOfClasses = cer.getAllClasses();
//		request.setAttribute("obj",listOfClasses);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Connection con;
		ResultSet rs;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","priyam@1234");
		Statement statement = con.createStatement();
		String query="Select classes.cid, subject.sname from classes INNER JOIN subject on classes.csid=subject.sid";
		rs = statement.executeQuery(query);
		pw.println("<table><tr>");
		pw.println("<td>Class</td>");
		pw.println("<td>Subject Name</td>");
		pw.println("</tr>");
		pw.println("</table>");
		while(rs.next())
		{
		Integer cId = rs.getInt("cid");
		String Sname = rs.getString("Sname");
		pw.println("<table><tr>");
		pw.println("<td>"+cId+"</td>");
		pw.println("<td>"+Sname+"</td>");
		pw.println("</tr>");
		pw.println("</table>");
		}
		try
		{
			con.close();
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		}
		catch(SQLException sx)
		{
			pw.println(sx);
		}
		catch(ClassNotFoundException cx)
		{
			pw.println(cx);
		}
//		RequestDispatcher rd = request.getRequestDispatcher("displayClasses.jsp");
//		rd.include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		int csid = Integer.parseInt(request.getParameter("csid"));
		
		Classes cc = new Classes();
		cc.setCid(cid);
		cc.setCsid(csid);
		ClassesDao cd = new ClassesDao();
			ClassesService cer = new ClassesService();
			String result = cer.storeClassesInfo(cc);
				doGet(request, response);
			pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
		rd.include(request, response);											//source page + target page combines as one page.
		
	}

}
