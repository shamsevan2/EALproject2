package Classroom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	static WebDriver driver;
	
	public static void Screenshot() throws IOException {
		 String ud=System.getProperty("user.dir");
		
		Date dateinDateFormat= new Date();
//		System.out.println(dateinDateFormat);
		String Date=dateinDateFormat.toString().replace(" ", "_").replace(":", "_");
//		System.out.println(Date);
	
		 File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
		 FileHandler.copy(ScreenshotFile,new File(ud+"\\Screenshots\\Amazon\\"+Date+"myss.jpg") );	
	}
	
	

}
