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

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//1. take screenshot and copy it into source
		WebElement src=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		String random=RandomString.make(4);
		String filename="facebook";
	    File Source=((TakesScreenshot) src).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		// STring path= "C:\\Users\\Shivkumar\\Desktop\\screenshotbyshiv\\facebook.png"
		File destination=new File("C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\screenshot"+filename+""+random+".png");
		FileHandler.copy(Source, destination);
	}

}
