package personClasses;
import java.util.ArrayList;

public class WorkExperience {

	
	private ArrayList<Job> workExp;
	
	
	
	public WorkExperience() {
		// TODO Auto-generated constructor stub
		workExp=new ArrayList<Job>();
		
		
	}
	public ArrayList<Job> getList()
	{
		return workExp;
	}
	
	public void addJob(Job j)
	{
		if(workExp.size()==10)
		{
			workExp.remove(0);
			workExp.add(j);
		}
		else
		{
			workExp.add(j);
		}
	}
	public Job getJob(int i)
	{
		return workExp.get(i);
	}
	
	@Override
	public String toString()
	{
		if(!workExp.isEmpty())
		{	
			StringBuilder build = new StringBuilder("<h3 class=\"title\">Work Experience</h3><br>");
			
			for(int i=0;i<workExp.size(); i++)
			{
				build.append("<p class=\"job\">"+workExp.get(i).toString()+"</p><br>");
				
				
			}
			return build.toString();
		}
		else
		{
			return "<p class=\"job\">This person is a freeloader</p><br><br>";
		}
		
	}

}
