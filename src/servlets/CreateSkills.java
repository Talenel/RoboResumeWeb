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
 * Servlet implementation class CreateSkills
 */
@WebServlet("/CreateSkills")
public class CreateSkills extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSkills() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String nextURL;
		
		String skillName = request.getParameter("skillName");
		String skillRating = request.getParameter("skillRating");
		
		
		Person pers= (Person) session.getAttribute("person");
		
		Skill s=new Skill(skillName,skillRating,pers.getID());
		pers.getSkills().addSkill(s);;
		
		
		
		String error="";
		
		String message=s.toString();
		
		
		System.out.println("answer  "+request.getParameter("continue"));
		if(!(request.getParameter("continue")==null))
		{
			nextURL = "/createSkill.jsp";
		}
		else
		{
			nextURL = "/RoboResume.jsp";
			
		}
		request.setAttribute("resume", pers.toString());
		
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		session.setAttribute("person", pers);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
