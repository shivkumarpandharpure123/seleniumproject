package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(3000);
		boolean b=driver.findElement(By.xpath("//input[@value=\"2\"]")).isSelected();
	     System.out.println(b);
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
	    boolean b1= driver.findElement(By.xpath("//input[@value=\"2\"]")).isSelected();
	     System.out.println(b1);
	     
	     driver.close();
}
}