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
 * Servlet implementation class CreatePerson
 */
@WebServlet("/CreatePerson")
public class CreatePerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String nextURL;
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String error;
		String message;
		if(name.equals("")||email.equals(""))
		{
			nextURL = "/createPerson.jsp";
			error="One of the fields was left empty.  All fields must be filled!";
			message="";
		}
		else
		{
			 nextURL = "/createEducation.jsp";
			Education edu=new Education();
			WorkExperience workExp=new WorkExperience();
			SkillsList s=new SkillsList();
			Person pers=new Person(name,edu,workExp, s, email);
			
			
			session.setAttribute("person", pers);
			error="";
			
			message=pers.getID()+"\t"+pers.getName()+"\t"+pers.getEmail();
			
		}
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}
	
	
	
}
