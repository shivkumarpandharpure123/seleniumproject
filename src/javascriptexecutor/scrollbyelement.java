package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbyelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor Js  = (JavascriptExecutor) driver;
//		
//        WebElement mail= driver.findElement(By.xpath("//input[@id=\"email\"]"));
//         Thread.sleep(2000);
//        WebElement pass= driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        Thread.sleep(2000);
         WebElement click=driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
         
         Js.executeScript("arguments[0].click()", click);	}

}
