package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamiclistbox {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\eclipse-workspace\\\\4th even\\\\src\\\\Variables\\\\selenium project\\\\4june\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(3000);
		List<WebElement>dynamic=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		dynamic.size();
		System.out.println(dynamic.size());
		
		for(int i=0; i<dynamic.size(); i++) {
			
			dynamic.get(i).getText();	
			if(dynamic.get(i).getText().equals("Warje, Pune")) {
				
				System.out.println(dynamic.get(i).getText());
				dynamic.get(i).click();
				break;	
			}
		}
		
		System.out.println("=================================");
		driver.findElement(By.id("dest")).sendKeys("latur");
        Thread.sleep(3000);
		List<WebElement>dest=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	System.out.println(dest.size());
	
	for(int i=0; i<dest.size();i++) {
		dest.get(i).getText();
		
		if(dest.get(i).getText().equals("Murud (latur)")) {
			System.out.println(dest.get(i).getText());
			dest.get(i).click();
			break;
		}
		
	}
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
	driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		
		

		
 
		
		
	}

}
