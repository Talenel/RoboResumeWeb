package personClasses;
import java.util.ArrayList;

public class Education {

	private ArrayList<Schooling> edu;
	
	public Education() {
		// TODO Auto-generated constructor stub
		 edu = new ArrayList<>();
	}
	
	public void addSchooling(Schooling s)
	{
		if(edu.size()==10)
		{
			edu.remove(0);
		}
		
		edu.add(s);
		
		
	}
	
	public Schooling getSchooling(int i)
	{
		return edu.get(i);
	}
	
	@Override
	public String toString()
	{
		if(!edu.isEmpty())
		{	
			StringBuilder build = new StringBuilder("<h3 class=\"title\">Education</h3><br>");
			
			for(int i=0;i<edu.size(); i++)
			{
				build.append("<p class=\"school\">"+edu.get(i).toString()+"</p><br>");
				
				
			}
			return build.toString();
		}
		else
		{
			return "<p class=\"job\">This person is uneducated</p><br><br>";
		}
		
	}
	
	

}
