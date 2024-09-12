package sep12th;

public class Clock {
	
	
	 int hr,min,sec;
	 
	 //setters
	 
	 public void setClock(int a,int b,int c)
	 {
		 hr=a;
		 min=b;
		 sec=c;
	 }
	 
	 public void getClock()
	 {
		 //System.out.println(hr+":"+min+":"+sec);
		 System.out.format("%02d:%02d:%02d",hr,min,sec);
		 System.out.println();
	 }
	
	
}
