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

public class screenshot4 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		// 1 take full screen shot of zerodha page
		screenshot1("zerodha",RandomString.make(3));
	
		
		// take screenshot of login page 
		screenshot2("zerodha",RandomString.make(3));	
	}
	public static void screenshot1(String filename1,String RandomString1) throws IOException {
		
		File Source1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination1= new File("C:\\Users\\Shivkumar\\Desktop\\screenshotbyshiv\\"+filename1+""+RandomString1+".png");
		FileHandler.copy(Source1, Destination1);
		
		
	}
	public static void screenshot2(String filename2,String randomstring2) throws IOException {
		WebElement src=driver.findElement(By.xpath("//div[@id=\"container\"]"));
		File Source2 =((TakesScreenshot)src).getScreenshotAs(OutputType.FILE);
		File Destination2= new File(".\\4june\\"+filename2+""+randomstring2+".png");
		FileHandler.copy(Source2, Destination2);
		
	}	
}
