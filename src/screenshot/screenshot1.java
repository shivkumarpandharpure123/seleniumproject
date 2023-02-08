package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//1. take screenshot and copy it into source
		
		File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		
		File destination=new File("C:\\Users\\Shivkumar\\Desktop\\screenshotbyshiv\\facebook.png");
		
		FileHandler.copy(Source, destination);
		
		driver.close();
	}

}
