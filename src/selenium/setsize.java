package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		
	WebDriver driver=  new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	Dimension size1=new Dimension(200,400);
	driver.manage().window().setSize(size1);
	Thread.sleep(10000);
	
	driver.close();
	
	
			
			
	
	
	
		
	}

}
