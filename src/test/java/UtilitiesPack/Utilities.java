package UtilitiesPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Utilities {
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
	  public void afterClass() throws IOException {
		  Screenshot_AfterClass();
	  }
	  
	  @AfterMethod
	  public void aftermethod() throws IOException {
		  Screenshot_aftermethod();
	  }
	  
	
	  
	  public void Screenshot_Random() throws IOException {
			 String ud=System.getProperty("user.dir");		
			Date dateinDateFormat= new Date();
			String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");
			 File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
			 FileHandler.copy(ScreenshotFile,new File(ud+"\\Screenshots\\RandomScreenshots\\"+Date+"myss.jpg") );	
		}
	  
	  public void Screenshot_aftermethod() throws IOException {
			 String ud=System.getProperty("user.dir");		
			Date dateinDateFormat= new Date();
			String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");
			 File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
			 FileHandler.copy(ScreenshotFile,new File(ud+"\\Screenshots\\After method Screenshots\\"+Date+"myss.jpg") );	
		}
	  
	  public void Screenshot_AfterClass() throws IOException {
			 String ud=System.getProperty("user.dir");		
			Date dateinDateFormat= new Date();
			String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");
			 File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
			 FileHandler.copy(ScreenshotFile,new File(ud+"\\Screenshots\\ActerclassScreenshots\\"+Date+"myss.jpg") );	
		}
	  
	  
	  
}
