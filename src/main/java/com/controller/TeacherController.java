package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Teacher;
import com.service.TeacherService;

/**
 * Servlet implementation class StudentController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		TeacherService ter = new TeacherService();
		List<Teacher> listOfTeacher = ter.getAllTeacher();
		request.setAttribute("obj",listOfTeacher);
		RequestDispatcher rd = request.getRequestDispatcher("displayTeachers.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		
		int tid = Integer.parseInt(request.getParameter("tid"));
		String tname = request.getParameter("tname");
		
		Teacher tt = new Teacher();
		tt.setTid(tid);
		tt.setTname(tname);
		
		TeacherService ter = new TeacherService();
		String result = ter.storeTeacherInfo(tt);
			doGet(request, response);
		pw.print(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
		rd.forward(request, response);											//source page + target page combines as one page.
		
		
	}

}
