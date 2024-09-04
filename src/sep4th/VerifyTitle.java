package sep4th;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class VerifyTitle {
	
	public static void main(String[] args) {
		
		ChromeDriver obj=new ChromeDriver();
		
		obj.get("https://adactinhotelapp.com/");
		
		obj.findElement(By.id("username")).sendKeys("reyaz0806");
		obj.findElement(By.id("password")).sendKeys("reyaz456");
		obj.findElement(By.id("login")).click();
		
		Assert.assertTrue(obj.getTitle().equals("Adactin.com - Search Hotel"));
		
	}

}
