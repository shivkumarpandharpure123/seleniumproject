package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousecontent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
				
	   driver.manage().window().maximize();
				
	   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
	   Thread.sleep(4000);
	   WebElement con=driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
	   Actions act=new Actions(driver);
	   act.moveToElement(con).build().perform();
	   
	   WebElement art=driver.findElement(By.xpath("//a[contains(text(),\"Articles\")]"));
	   art.getText();
	   
	   System.out.println(art);
	   
	   
	   
	   
}
}
