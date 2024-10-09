package assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchSwitch {

	public static void main(String[] args) {
		System.out.println("Enter the browser of your choice : ");

		Scanner input = new Scanner(System.in);
		String browser = input.next();

		WebDriver driver;

		switch (browser) {
		case "chrome":

			driver = new ChromeDriver();

			break;
		case "firefox":

			driver = new FirefoxDriver();

			break;

		case "edge":

			driver = new EdgeDriver();

			break;

		default:
			System.out.println("Not valid browser ");
			break;
		}

	}

}
