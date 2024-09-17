package sep17th;

public class Student {
	
	protected int rollNo;
	protected String sNa;
	
	public void setDetails(int rollno,String sNa)
	{
		this.rollNo=rollno;
		this.sNa=sNa;
	}
	
	public void getDetails()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Student name : "+sNa);
	}
	
	

}
