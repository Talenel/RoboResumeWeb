package personClasses;


import java.util.ArrayList;

public class SkillsList {

	

	
	private ArrayList<Skill> skill;
		
		
		
	public SkillsList() {
		// TODO Auto-generated constructor stub
		skill=new ArrayList<Skill>();
			
			
	}
	public void addSkill(Skill s)
	{
		if(skill.size()==20)
		{
			skill.remove(0);
			skill.add(s);
		}
		else
		{
			skill.add(s);
		}
	}
		
	@Override
	public String toString()
	{
		if(!skill.isEmpty())
		{	
			StringBuilder build = new StringBuilder("<h3>Skills</h3><br>");
				
			for(int i=0;i<skill.size(); i++)
			{
				build.append("<p class=\"skill\">"+skill.get(i).toString()+"</p><br>");
					
				
			}
			return build.toString();
		}
		else
		{
			return "<p class=\"skill\">This person is incompetent</p><br><br>";
		}
			
	}

	

}
