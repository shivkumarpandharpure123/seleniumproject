package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\Browser\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
					
		   driver.manage().window().maximize();
					Thread.sleep(3000);
					
					
		   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   
		   Actions act=new Actions(driver);
		   
		   WebElement source =driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		   WebElement des= driver.findElement(By.xpath("//div[@id=\"box103\"]"));
		   
		   act.dragAndDrop(source, des).build().perform();
            Thread.sleep(2000);

             WebElement sourc1 =driver.findElement(By.xpath("(//div[text()=\"Stockholm\"])[2]"));
  
            WebElement des2=driver.findElement(By.xpath("//div[text()=\"South Korea\"]"));
 
 
            act.dragAndDrop(sourc1, des2).perform();
 



		   
					
	}

}
