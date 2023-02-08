package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String Page= driver.getTitle();
		System.out.println(Page);
		
		driver.navigate().to("https://www.redbus.in/bus-tickets");
		
	
		Thread.sleep(10000);
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		Thread.sleep(10000);
		
		driver.close();
		
		 
	}

}
