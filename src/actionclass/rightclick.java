package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
					
		   driver.manage().window().maximize();
					
		   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
					
		   Thread.sleep(4000);
		   WebElement right =driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		   Actions act= new Actions(driver);
		   act.contextClick(right).build().perform();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("(//span[contains(text(),'copy')])[2]")).click();
		   driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		   driver.close();
		   
		   
		   
		   
	}

}
