package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//step 2
		WebDriver driver= new ChromeDriver();
		//step 2
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()=\"Search Buses\"]")).click();
		Thread.sleep(10000);
	}
	

}
