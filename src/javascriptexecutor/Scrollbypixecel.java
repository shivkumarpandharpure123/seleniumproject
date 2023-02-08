package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbypixecel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor Js  = (JavascriptExecutor) driver;
		
		
//		// Scrolldown/up byPixcel 
//		Js.executeScript("window.scrollBy(0,2000)", "");
//		Thread.sleep(3000);
//		Js.executeScript("window.scrollBy(0,-1000)", "");
//		
//		// ScrollDownUp Till bottom/UP
		
		
        Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        
		Thread.sleep(3000); 
		
        Js.executeScript("document.documentElement.scrollTop=0");
	}

}
