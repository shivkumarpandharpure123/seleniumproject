package windowhandlemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String window=driver.getWindowHandle();
		System.out.println(window);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String window1=driver.getWindowHandle();
		System.out.println(window1);
		driver.quit();

		
		
		
	}

}
