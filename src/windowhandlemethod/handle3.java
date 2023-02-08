package windowhandlemethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
	Thread.sleep(3000);
	
	Set<String> windowid=driver.getWindowHandles();
	
	// 2 by usig iterator 
	Iterator <String> it=windowid.iterator();
    String parentWindo=it.next();
     String ChildWindow=it.next();
     
     System.out.println("parentWindo:"+ChildWindow);
     System.out.println("ChildWindow:"+ChildWindow);
     
     Thread.sleep(3000);
     
     driver.switchTo().window(parentWindo);
     Thread.sleep(3000);
     
     driver.switchTo().window(ChildWindow);
     Thread.sleep(3000);
     System.out.println(driver.getTitle());
     
     driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("shivkumarpandharpure77@gmail.com");
     
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     
     // BY using advance loop
     
     for(String WinId:windowid) {
    	 
    	String TEXT= driver.switchTo().window(WinId).getTitle();
    	if(TEXT.equals("OrangeHRM")|| TEXT.equals("Sign Up for a Free HR Software Trial | OrangeHRM | OrangeHRM\n")) {
    		driver.close();
    		
    	}
        System.out.println(TEXT);

     }
    
}

}
