package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleassign {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement>link=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//li"));
		
		System.out.println("total count:"+link.size());
		for(int i=0; i<link.size(); i++) {
			link.get(i).getText();
			System.out.println(link.get(i).getText());
		if(link.get(i).getText().equals("selenium webdriver"));{
			System.out.println(link.get(i).getText());
				link.get(i).click();
				break;	
			}	
		}
		System.out.println();
		
		
	}

}
