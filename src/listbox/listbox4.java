package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox4 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Accou')]")).click();
		Thread.sleep(3000);
		
		String Dayxpath="//select[@id=\"day\"]//option";
		String Monthxpath="//select[@id=\"month\"]//option";
		String yearxpath="//select[@id=\"year\"]//option";
		
		String Dob="26/5/2023";
		String date []=Dob.split("/");
		
		selectdropdrown(selectdropdrown,date[0])
		
		

		
		
	}
	public static void selectdropdrown(Sring xpath,String value) {
		
	}

}
