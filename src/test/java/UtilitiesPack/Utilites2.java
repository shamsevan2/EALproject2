package UtilitiesPack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilites2 {
	 public static WebDriver driver;

     @Parameters({"Browser","UrlAddress"})
	  @BeforeClass
	  public void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {
			
		     String ud=System.getProperty("user.dir");

			if(NameOfBrowser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",ud+"\\Drivers\\chromedriver.exe" );
				                                            
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get(url);

			}
			else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", ud+"\\Drivers\\msedgedriver.exe");
				
				driver= new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get(url);
				
			}}

	  
	  

	  @AfterClass
	  public void teardown() throws IOException {
		driver.close();
	  }
	  
	  
	
	  
	  public void Screenshot(String folderName) throws IOException {
			 String ud=System.getProperty("user.dir");		
			Date dateinDateFormat= new Date();
			String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");
			 File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
			 FileHandler.copy(ScreenshotFile,new File(ud+"\\Pictures\\"+folderName+"\\"+Date+"myss.jpg") );	
		}
	  
	


}
