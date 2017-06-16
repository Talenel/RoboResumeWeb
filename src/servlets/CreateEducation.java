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
 * Servlet implementation class CreateEducation
 */
@WebServlet("/CreateEducation")
public class CreateEducation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateEducation() {
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
		String error;
		String message;
		
		String college = request.getParameter("college");
		String yearGrad = request.getParameter("yearGrad");
		String degType = request.getParameter("degType");
		String degMajor = request.getParameter("degMajor");
		
		Person pers= (Person) session.getAttribute("person");
		if(college.equals("")||yearGrad.equals("")|| degType.equals("")|| degMajor.equals(""))
		{
			nextURL = "/createEducation.jsp";
			message="";
			error="One of the fields was left empty.  All fields must be filled!";
		}
		else
		{
			Schooling sch=new Schooling(college, Integer.parseInt(yearGrad),degType,degMajor, pers.getID());
		
			pers.getEducation().addSchooling(sch);
			
			
			
			error="";
			
			message=sch.toString();
			
			if(!(request.getParameter("continue")==null))
			{
				nextURL = "/createEducation.jsp";
			}
			else
			{
				nextURL = "/createWorkExperience.jsp";
				
			}
		}
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		session.setAttribute("person", pers);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
		
	}

}
