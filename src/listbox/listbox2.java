package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Accou')]")).click();
		Thread.sleep(3000);
		WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	//	WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	//	WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
//		1.select by visible text
		
//		Select s1 = new Select(day);
//		s1.selectByVisibleText("5");
//		
//		Select s2 = new Select(Month);
//		s2.selectByVisibleText("Jan");
//		
//		Select select3= new Select(year);
//		select3.selectByVisibleText("2022");
//		2.select by value 
//    Select select4 = new Select(day);
//     select4.selectByValue("10");
//     
//     Select select5 = new Select(Month);
//     select5.selectByValue("5");
//     
//	     Select select6 = new Select(year);	    
//	     select6.selectByValue("2020");
	
		//3.select by index
		
		 Select select7 = new Select(day);	    
         select7.selectByIndex(3);
		

		 /*Select select8 = new Select(Month);	    
         select8.selectByIndex(5);

	     Select select9 = new Select(year);	    
         select9.selectByIndex(35);*/
	     
	    
		
		
		
		
		
		
	}

}
