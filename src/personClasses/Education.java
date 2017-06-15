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
			StringBuilder build = new StringBuilder("Education<br>");
			
			for(int i=0;i<edu.size(); i++)
			{
				build.append(edu.get(i).toString()+"<br>");
				
				
			}
			return build.toString();
		}
		else
		{
			return "This person is uneducated<br><br>";
		}
		
	}
	
	

}
