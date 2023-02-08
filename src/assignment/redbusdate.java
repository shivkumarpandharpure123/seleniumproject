package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbusdate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
	    
		
	

	}

}
