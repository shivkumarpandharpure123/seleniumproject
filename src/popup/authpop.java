package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authpop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//syntax
	//https://username:password@url
	driver.get("https://admin:admin@https://the-internet.herokuapp.com/basic_auth");
	Thread.sleep(3000);
	String text=driver.findElement(By.xpath("//p[contains(text(),\"Congratulations! You must have the proper credentials\")]")).getText();
	System.out.println(text);
	driver.close();
}

}
