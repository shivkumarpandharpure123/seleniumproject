package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class voidtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		

		
      WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		

	}

}
