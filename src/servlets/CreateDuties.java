package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import personClasses.*;

/**
 * Servlet implementation class CreateDuties
 */
@WebServlet("/CreateDuties")
public class CreateDuties extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateDuties() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String nextURL;
		
		String dutyDesc = request.getParameter("dutyDesc");
		Person pers= (Person) session.getAttribute("person");
		pers.getWorkExp().getJob(pers.getWorkExp().getList().size()-1).getDuties().add(dutyDesc);
		
		
		
		String error="";
		
		String message=dutyDesc;
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		
		System.out.println("answer  "+request.getParameter("continue"));
		if(!(request.getParameter("continue")==null))
		{
			nextURL = "/createDuties.jsp";
		}
		else
		{
			nextURL = "/createWorkExperience.jsp";
			pers.getWorkExp().getJob(pers.getWorkExp().getList().size()-1).inputDuties();
			
		}
		
		session.setAttribute("person", pers);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

	//pers.getWorkExp().getJob(pers.getWorkExp().getList().size()-1).getDuties().get(pers.getWorkExp().getJob(pers.getWorkExp().getList().size()-1).getDuties().size()-1)
}
