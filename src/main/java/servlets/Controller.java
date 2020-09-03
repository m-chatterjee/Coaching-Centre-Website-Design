package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassDAO;
import model.Student;


public class Controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("studentName");
		String email=request.getParameter("studentEmail");
		String phnNo=request.getParameter("studentPhone");
		String dob=request.getParameter("studentDOB");
		String school=request.getParameter("studentSchool");
		double phyMarks=Double.parseDouble(request.getParameter("studentPhyMarks"));
		double totalMarks=Double.parseDouble(request.getParameter("studentTotalMarks"));
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPhnNo(phnNo);
		student.setDob(dob);
		student.setSchlName(school);
		student.setPhyMarks(phyMarks);
		student.setTotalMarks(totalMarks);
		
		ClassDAO dao=new ClassDAO();
		
		try {
			dao.setData(student);
			
			 RequestDispatcher rd=request.getRequestDispatcher("ResponsePage.jsp");
			 rd.forward(request, response);
				
			
		} catch (Exception e) {
			 RequestDispatcher rd=request.getRequestDispatcher("ErrorPage.jsp");
			 rd.forward(request, response);
		} 
		
	}

}
