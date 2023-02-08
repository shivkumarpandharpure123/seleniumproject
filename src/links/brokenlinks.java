package links;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");

		 List <WebElement> link=driver.findElements(By.tagName("a"));
		 System.out.println(link.size());
		 int brokenlink=0;
		 for(WebElement element :link) {
			String url= element.getAttribute("href");
			
			if (url==null|| url.isEmpty()) {
				System.out.println( " url is empty");
				continue;
			}
			
			URL  UL=new URL(url);          // create the object of url class by passing input string 
			
			HttpsURLConnection httpcode=(HttpsURLConnection)UL.openConnection();
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				System.out.println(httpcode.getResponseCode()+"---->"+url+"is ---->"+"Broken Links");
				brokenlink++; 
		 }
			else {
				System.out.println((httpcode.getResponseCode()+"--->"+url+"is ----->"+"Valid Links"));
			}
System.out.println("Number of broken links : "+brokenlink);
			
			driver.quit();
		
				

	}

	}
}