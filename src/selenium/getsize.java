package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
//		
//		Dimension size1= new Dimension(400,500);
//		
//		driver.manage().window().setSize(size1);
//		Thread.sleep(10000);
		
           System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
