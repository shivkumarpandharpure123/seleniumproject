package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chorome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		
		
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		driver.quit();
		
		
		

	}

}
