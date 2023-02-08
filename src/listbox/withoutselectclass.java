package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Accou')]")).click();
		Thread.sleep(3000);
		
	    List<WebElement> DayList= driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		
		DayList.size();
		System.out.println(DayList);
		
		for(int i=0; i<DayList.size();i++) {
			System.out.println(DayList.get(i).getText());
			
			if(DayList.get(i).getText().equals("14")) {
				
				DayList.get(i).click();
				
			}
			
		}
		System.out.println("========================");
		List<WebElement>Monthlist=driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
		Monthlist.size();
		System.out.println(Monthlist.size());
		
		for(int i=0; i<Monthlist.size(); i++) {
			System.out.println(Monthlist.get(i).getText());
			
			if(Monthlist.get(i).getText().equals("may")) {
				
				Monthlist.get(i).click();
				
			}
			
		}
		
		System.out.println("=========================================");
		
		List<WebElement>Yearlist= driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		Yearlist.size();
		System.out.println(Yearlist);
		
		for(int i=0; i<Yearlist.size(); i++) {
			
			System.out.println(Yearlist.get(i).getText());
		
			if(Yearlist.get(i).getText().equals("2025")){
				Yearlist.get(i).click();
			}
		}
		

		
		
		 
	}

}
