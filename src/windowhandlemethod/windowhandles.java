package windowhandlemethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\eclipse-workspace\\4th even\\src\\Variables\\selenium project\\4june\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		Thread.sleep(3000);
		
		Set <String> windowid=driver.getWindowHandles();
		
		// BY using iterator
		Iterator<String> it=windowid.iterator();
		
		String ParentWindow=it.next();
		String ChildWindow=it.next();
		
		System.out.println("parentWindow:"+windowid);
		System.out.println("ChildWindow:"+ChildWindow);
		
		
		System.out.println();
		// 2 by using array list
		
        ArrayList<String> WindowList = new ArrayList(windowid);
       String parent= WindowList.get(0);
        String child=WindowList.get(1);
       System.out.println("parentWindow:"+parent);
        System.out.println("ChildWindow:"+child);
      driver.quit();

		

	}

}
