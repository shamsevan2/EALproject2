package Classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleBrowsersConcept {
	
	static WebDriver driver;	


	public static void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {
		
	     String ud=System.getProperty("user.dir");

		if(NameOfBrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",ud+"\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(url);

		}
		else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ud+"\\Drivers\\msedgedriver.exe");
			
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get(url);
			
		}	
	
	
}}
