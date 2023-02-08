package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
	public static void main(String[] args) {
		
		//GetTitle == it is used foe enter the title of applicaton in programme
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();    // get
		System.out.println(title);
		String expectedresult="Facebook-log in or sign up";
		
		
		if(title.equals(expectedresult)) {
			System.out.println("correct url");
			
		}
		else {
			System.out.println("incorrect result");
		}
		
		
		
		
	}

}
