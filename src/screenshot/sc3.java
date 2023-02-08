package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sc3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Tsc("face");
		Tsc("redbus");
		
		
	
	}
		public static void  Tsc (String Filename) throws IOException {
			

			File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String random=RandomString.make(4);
			String filename="facebook";
			File destination=new File(".//4june//"+filename+""+random+".jpg");
			
			FileHandler.copy(Source, destination);
			
			
		
		
	}

}
