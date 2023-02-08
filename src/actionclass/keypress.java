package actionclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keypress {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"target\"]")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
