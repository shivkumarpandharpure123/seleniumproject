package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 {
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\Browser\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Create New Accou')]")).click();
	Thread.sleep(3000);
	
	WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	Thread.sleep(3000);
	
	Select selectday = new Select(day); 
	
	// 1. how will get total no of size.
	
	 List<WebElement>listday=selectday.getOptions();
	 listday.size();
	 System.out.println(listday);
	 
	 //2. how will u find all the elements 
	 
	 for (int i=0; i<listday.size(); i++) {
		String listvalues =listday.get(i).getText();
		System.out.println(listvalues);
		
		// 3. how will u find specific values from list
		
		if (listvalues.equals("15")){
			listday.get(i).click();
			System.out.println(listday);
	}
	
		
		
	 }
	 
	 
	 
	
	
	
	
	 
	      
   
	   
	   
	
	}	
	
	
	
	
}
	


