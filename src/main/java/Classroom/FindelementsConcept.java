package Classroom;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindelementsConcept {
	static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		
		Ibrowsers("chrome", "https://www.amazon.com");
		
		//making an array of all returned elements
		List<WebElement>  allbtns=driver.findElements(By.linkText("Amazon Basics 2"));
		
		
		//finding out the size of the array ,if we can find the size we can easily know how many element has returned
		int numberofelements=allbtns.size();
		
		
		//if element found
	    if(numberofelements==1) {
	    	driver.findElement(By.linkText("Amazon Basics")).click();
	    }
	    else {
	    	System.out.println("Amazon basics has been changed or multiple element found");
	    }
		
	
		
		
		
		
		System.out.println("this is shams");
		
		
		
	

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
