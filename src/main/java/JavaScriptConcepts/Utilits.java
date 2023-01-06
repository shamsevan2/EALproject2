package JavaScriptConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilits {
	static WebDriver driver;
	
	
	public static void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {	
		
	     String ud=System.getProperty("user.dir");
	     //ud=D:\Eclipse Workspaces\My all Eclipse\Batch31\EalProject2
	     
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
}
	
	
	
	
	public static void Screenshot() throws IOException {
		 String ud=System.getProperty("user.dir");		
		Date dateinDateFormat= new Date();
		String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");	
		 File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
		 FileHandler.copy(ScreenshotFile,new File(ud+"\\Screenshots\\Amazon\\"+Date+"myss.jpg") );	
	}


}
