package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		try {
			new FileInputStream("D:\\FLM15thJulyWS\\JavaSeasons\\abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Make sure file is available next time ..");
		}
		
		Thread.sleep(3000);
		
		System.out.println("End of program..");

	}

}
