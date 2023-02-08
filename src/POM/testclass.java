package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe\\\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		loginpage1 kp = new loginpage1(driver);
		kp.username();
		kp.password();
		kp.login();
		
		loginpage2 kp1 = new loginpage2(driver);
		kp1.pin();
		homepage kp2= new homepage(driver);
		kp2.useid();
		
		
		
		
		
		
		
		
		
	}

}
