package actionclass;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.cms.bc.BcEdDSASignerInfoVerifierBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TEST {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

Actions act= new Actions(driver);
act.moveToElement(login).build().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class=\"_3vhnxf\"])[4]")).click();
Thread.sleep(2000);

driver.get("https://www.amazon.in/");
WebElement more =driver.findElement(By.xpath("(//span[contains(text(),'Prime')])[3]"));
Actions moreActions= new Actions(driver);
act.moveToElement(more).build().perform();
Thread.sleep(2000);





Thread.sleep(2000);
driver.close();

	}

}
