package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//i[@class=\"hm-icon nav-sprite\"]")).click();
//		driver.findElement(By.xpath("//a[@class=\"hmenu-item\"]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"nav-a  \"] [6]")).click();
		Thread.sleep(3000);
	}

}
