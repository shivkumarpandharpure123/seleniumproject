package diff;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
         List text=(List) driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		Thread.sleep(3000);
	}

}
