package actionclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouceover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement input1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		
		input1.sendKeys("This is my first java program");
		
		Actions Act=new Actions(driver);
		
		Thread.sleep(3000);
		// cntr a
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("a");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
		
		
		// cntr c
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("c");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
		
		// cntr v
		Act.sendKeys(Keys.TAB);
		Act.build().perform();
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("v");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
		

		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Correct copied");
		else
			System.out.println("Incorrect");
		
		
		
		
		
	}

}
