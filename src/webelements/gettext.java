package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String Text=driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getText();
		System.out.println(Text);
		Thread.sleep(10000);
		
	String Exceptedresult= "Facebook helps you connect and share with the people in your life";
	
	if(Text.equals(Exceptedresult)){
		
	System.out.println("correct");
		
	}
	else {
		System.out.println("incorrect");
	}

		

	}

}
