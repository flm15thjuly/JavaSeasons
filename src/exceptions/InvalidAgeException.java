package exceptions;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException()
	{
		super("Invalid age ..Please visit to this page once your age is 18..");
	}

}
