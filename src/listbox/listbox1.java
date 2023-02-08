package listbox;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class listbox1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		JavascriptExecutor Js  = (JavascriptExecutor)driver;
		WebElement lang=driver.findElement(By.xpath("//span[@class=\"nav-arrow icp-up-down-arrow\"]"));
        Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		act.moveToElement(lang).build().perform();
		Thread.sleep(2000);
		WebElement marathi=driver.findElement(By.xpath("(//i[@class=\"icp-radio\"])[14]"));
		marathi.click();
		boolean b=driver.findElement(By.xpath("(//i[@class=\"icp-radio\"])[14]")).isSelected();
		System.out.println(b);
		Thread.sleep(2000);
		List<WebElement> langt=driver.findElements(By.xpath("//span[@class=\"nav-text\"]"));
		int size=langt.size();
		System.out.println(size);
		for(int i=size-7;i<size; i++) {
			langt.get(i).click();
		}
		
	}

}
