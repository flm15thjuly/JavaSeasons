package sep16th;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		c1.getClock();
		
		
		
		//user 2
		
		Clock c2=new Clock(9);
		c2.getClock();
		
		//user 3
		
		Clock c3=new Clock(9,32);
		c3.getClock();
		
		//user 4
		
				Clock c4=new Clock(9,32,55);
				c4.getClock();
		
	}

}
