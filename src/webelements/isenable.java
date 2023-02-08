package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe"
			+ "");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	boolean b=driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled();
	System.out.println(b);
	
	boolean b1=driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).isEnabled();
	System.out.println(b1);
	boolean b2=driver.findElement(By.xpath("//input[@type=\"password\"]")).isEnabled();
	System.out.println(b2);
	
	driver.close();
}

}
