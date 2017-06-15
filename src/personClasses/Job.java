package personClasses;
import java.util.ArrayList;

public class Job {
	
	private String role;
	private long salary;
	private int id;
	private String name;
	private String startDate;
	private String endDate;
	private String company;
	private ArrayList<String> duty;
	private String empID;
	
	public Job(String aName, String aCompany, String aRole, long aSalary, int aID, String aStartDate)
	{
		role=aRole;
		salary=aSalary;
		id=aID;
		name=aName;
		startDate=aStartDate;
		endDate="Present";
		company=aCompany;
		
	}
	public Job(String aName, String aCompany, String aStartDate, String anEndDate, String persID)
	{
		
		name=aName;
		startDate=aStartDate;
		endDate=anEndDate;
		company=aCompany;
		
		duty=new ArrayList<String>();
		Database db=new Database();
		db.addEmployment(aName, aCompany, aStartDate, anEndDate, persID);
		empID=db.getEmplomentID();
		
	}
	public Job(String aName, String aCompany, ArrayList<String> duties, String aStartDate, String anEndDate, String persID)
	{
		duty=duties;
		name=aName;
		startDate=aStartDate;
		endDate=anEndDate;
		company=aCompany;
		Database db=new Database();
		db.addEmployment(aName, aCompany, aStartDate, anEndDate, persID);
		
		empID=db.getEmplomentID();
		for(int i=0; i<duty.size();i++)
		{
			db.addDuty(empID, duties.get(i));
		}
		
	}
	
	
	public String getRole() {
	    return role;
	}
	
	public void setRole(String role) {
	    this.role = role;
	}
	
	public long getSalary() {
	    return salary;
	}
	
	public void setSalary(long salary) {
	    this.salary = salary;
	}
	
	public int getId() {
	    return id;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	public String getStart()
	{
		return startDate;
	}
	
	public String getEnd()
	{
		return endDate;
	}
	public ArrayList<String> getDuties()
	{
		return duty;
	}
	
	
	
	
	
	public void setEnd(String anEndDate)
	{
		endDate=anEndDate;
	}
	public void setStart(String aStartDate)
	{
		startDate=aStartDate;
	}
	public void setDuties(ArrayList<String> duties)
	{
		
		duty=duties;
		
	}
	public void inputDuties()
	{
		Database db=new Database();
		for(int i=0; i<duty.size();i++)
		{
			db.addDuty(empID, duty.get(i));
		}
	}
	public String exceptDuties()
	{
		return  name+":<br>"+company+", " +startDate+" - "+endDate+"<br>"+"<br>";
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<duty.size();i++)
		{
			sb.append("-Duty "+(i+1)+", "+duty.get(i)+"<br>");
		}
		
		return  name+":<br>"+company+", " +startDate+" - "+endDate+"<br>"+sb.toString()+"<br>";
		
	}
	
}
