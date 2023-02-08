package FRAMEWORK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withframework {

	    @SuppressWarnings("deprecation")
	    public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	    // TODO Auto-generated method stub
	    	
	    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String path="C:\\Users\\Shivkumar\\Desktop\\sheet1.xlsx\\";
		FileInputStream File=new FileInputStream(path);
		Sheet sh=WorkbookFactory.create(File).getSheet("sheet1");
		
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("username");
		Thread.sleep(2000);
		double password=sh.getRow(0).getCell(1).getNumericCellValue();
        
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
	    double pin=sh.getRow(0).getCell(2).getNumericCellValue();

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("pin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		

		
	}

}
