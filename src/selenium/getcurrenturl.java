package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(10000);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
	
		
		if(url.equals("https://web.whatsapp.com/"));
		{
		
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}

		
		driver.close();
		
		
		
	}

}
