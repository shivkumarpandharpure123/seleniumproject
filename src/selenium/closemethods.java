package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closemethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//step 2
		WebDriver driver= new ChromeDriver();
		//step 2
		
		driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
