package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","\"C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	Thread.sleep(3000);

	WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	Thread.sleep(3000);
	String DOB = "22/2/2022";
	String Date[]=DOB.split("/");
	
	ListBox(day,Date[0]);
	ListBox(month,Date[1]);
	ListBox(year,Date[2]);

	
}
public static void ListBox(WebElement element, String value) {	
		
		Select Select1 =new Select(element);
		
		Select1.selectByValue(value);

}
}