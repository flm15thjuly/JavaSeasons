package sep11th;

 public class Bank {
	
	private double balance=10000;
	
	//public methods to access private variables 
	
	//getters
	
	public void getBalance(int pin)
	{
		//validation
		if(pin==3214)
		{
			System.out.println("Balance is "+balance);
		}
		else
		{
			System.out.println("Wrong pin entered ..");
		}
		
	}
	
	//setters

	public void setBalance(double deposit)
	{
		
		balance = balance + deposit;
	}
}
