package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	Thread.sleep(3000);
	driver.switchTo().frame("iframeResult");
	driver.switchTo().frame(0);
   String text2=driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText();
   System.out.println(text2);
   driver.switchTo().parentFrame();
  String text =driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
   System.out.println(text);
   driver.switchTo().defaultContent();
   driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
   
   
		
	}

}
