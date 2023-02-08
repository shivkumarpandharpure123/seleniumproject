package listbox;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.cms.bc.BcEdDSASignerInfoVerifierBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cutimizedlistbox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("https://www.redbus.in/");
driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("pune");

 List<WebElement> elements=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
  int size=elements.size();
  System.out.println(size);
  
  driver.findElement(By.xpath("//input[@name=\"q\"]"));
  google =driver.findElement(By.xpath("))
  
  for (int i=0; i<=size; i++) {
	  
   String list = elements.get(i).getText();
	 
	 System.out.println(list);

  }
  
  
	}

}
