package selenium  ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {    

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver  driver =new  ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
