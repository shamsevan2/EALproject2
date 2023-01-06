package PRodLEVEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	
  @Test
  public void m3() {
	  System.out.println("m3 from Test1 class");
	  System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\31 repo\\EalProject2\\Drivers\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
  }
  
  
  @Test
  public void m4() {
	  System.out.println("m4 from Test1 class");
	  System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\31 repo\\EalProject2\\Drivers\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
  }
}
