package WebTabless;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		           // no of row present in webtables
					int Row1 =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
					System.out.println("total no rows :"+Row1);
					
					List<WebElement> Row2=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
					System.out.println(Row2.size());
					System.out.println("============================================================");
				    // no of coloumn in webtables
					int col= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
					System.out.println(col);
					List<WebElement>COL1=	 driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
					System.out.println(COL1.size());
					// 2 way by using list of webelement
					System.out.println("==========================================================================");
					
					
					// retriver the data from specific row and coloumn
					String value=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[3]")).getText();
					System.out.println(value);
					String value1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[7]/td[3]")).getText();
					System.out.println(value1);
					System.out.println("============================================================================");
					
					// print all the row and column data 
					// for loop outer loop
					for(int i=2; i<=Row1; i++) {
						for(int j=1; j<=col; j++) {
							String actualvalue=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
							System.out.println(actualvalue+ " | ");
		                    // we can not pass the direct value of varibales into xpath
							
							if(actualvalue.equals("Island Trading	")) {
								
								System.out.println("Row No :"+i+" : "+"col no :"+j );
					   	    	continue;
								//System.out.println(i+j);
							}
						}
						System.out.println();
					}
						
	}

}
