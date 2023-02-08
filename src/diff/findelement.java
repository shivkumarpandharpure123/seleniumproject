package diff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	searchbox.sendKeys("oneplus");
	Thread.sleep(3000);
	
	//2.
	WebElement links=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
    System.out.println(links.getText());
    // .if the element is not  present in list it will show the no  such elementfound
    
	WebElement links1=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
	

	
	

}

}
