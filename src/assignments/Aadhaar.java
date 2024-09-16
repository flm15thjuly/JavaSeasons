package assignments;

public class Aadhaar {
	
	int passportId,voterId,drivingLicense;
	
	public void getAadhaar(int passportId)
	{
		generateRandomNumbers();
	}
	
	public void getAadhaar(int passportId,int voterId)
	{
		generateRandomNumbers();
	}
	
	public void getAadhaar(int passportId,int voterId,int drivingLicense)
	{
		generateRandomNumbers();
	}

	public void generateRandomNumbers()
	{
		System.out.println("your Aadhar is getting generated..");
		System.out.print("Here it is   ");
		System.out.print((int) (Math.random()*10000)+" ");
		System.out.print((int) (Math.random()*10000)+" ");
		System.out.print((int) (Math.random()*10000));
		System.out.println();
	}
}
