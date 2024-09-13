package sep13th;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		Clock c1=new Clock();
		
		c1.setClock(9);
		c1.getClock();
		
		//user 2
		
		c1.setClock(8, 55);
		c1.getClock();
		
		//user 3
		
		c1.setClock(9, 18, 55);
		c1.getClock();
		

	}

}
