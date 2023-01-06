package Classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findelements_Concept2 {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		Ibrowsers("chrome", "https://www.amazon.com");
		
		//at first store all the link element in a list array 
		
		Thread.sleep(10000);
		
		
		  List<WebElement> alllinksElements=driver.findElements(By.tagName("a"));
		  
		  System.out.println(alllinksElements.size());
		  
		  for(int i=0;i<alllinksElements.size();i++) {
		  System.out.println("text of the link element is :"+
		  alllinksElements.get(i).getText());
		  System.out.println("link of this element is : "+alllinksElements.get(i).
		  getAttribute("href")); }
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {
		
	     String ud=System.getProperty("user.dir");

		if(NameOfBrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",ud+"\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(url);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             
		}
		else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ud+"\\Drivers\\msedgedriver.exe");
			
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}	
		

	
	
}
	

}
