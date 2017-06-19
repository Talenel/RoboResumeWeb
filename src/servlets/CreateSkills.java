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
		String error;
		String message;
		
		String skillName = request.getParameter("skillName");
		String skillRating = request.getParameter("skillRating");
		Person pers= (Person) session.getAttribute("person");
		
		if(skillName.equals("")||skillRating.equals(""))
		{
			error="One of the fields was left empty.  All fields must be filled!";
			message="";
			nextURL = "/createSkill.jsp";
		}
		else
		{
			if(skillRating.equals("familiar")||skillRating.equals("intermediate")||skillRating.equals("proficient")||skillRating.equals("expert"))
			{	
				Skill s=new Skill(skillName,skillRating,pers.getID());
				pers.getSkills().addSkill(s);;
				
				error="";
				
				message=s.toString();
				
				
				if(!(request.getParameter("continue")==null))
				{
					nextURL = "/createSkill.jsp";
				}
				else
				{
					nextURL = "/RoboResumeSpec.jsp";
					request.setAttribute("resume", pers.toString());
				}
			}
			else
			{
				error="The skill rating field is invalid! Please choose 'familiar','intermediate','proficient' or 'expert'";
				message="";
				nextURL = "/createSkill.jsp";
			}	//*/
		}
		
		
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		session.setAttribute("person", pers);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
