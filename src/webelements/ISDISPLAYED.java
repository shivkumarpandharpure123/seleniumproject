package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import iframe.iframe;

public class ISDISPLAYED {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		
//	boolean b= driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).isDisplayed();
//	System.out.println(b);
		 boolean b1=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
		 System.out.println(b1);
		 Thread.sleep(3000);
		 String actual="Facebook";
		 
		 if(actual.equals(b1));
		 {
			System.out.println("element is displayed"); 
			 
		 }
		 
	
			
		
		 
		 
		driver.close();

	}

}
