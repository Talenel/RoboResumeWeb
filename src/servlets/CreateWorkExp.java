package servlets;

import personClasses.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateWorkExp
 */
@WebServlet("/CreateWorkExp")
public class CreateWorkExp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateWorkExp() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String nextURL;
		
		String title = request.getParameter("title");
		String company = request.getParameter("company");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		Person pers= (Person) session.getAttribute("person");
		
		Job j=new Job(title, company,start,end, pers.getID());
		pers.getWorkExp().addJob(j);
		
		
		
		String error="";
		
		String message=j.toString();
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		System.out.println("answer  "+request.getParameter("continue"));
		if(!(request.getParameter("continue")==null))
		{
			nextURL = "/createSkill.jsp";
		}
		else
		{
			nextURL = "/createDuties.jsp";
			
		}
		
		session.setAttribute("person", pers);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
