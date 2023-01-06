package PRodLEVEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver driver;
	
  @Test(threadPoolSize = 3, invocationCount = 3)
  public void m1() {
	  System.out.println("m1 from Test1 class");
	  System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\31 repo\\EalProject2\\Drivers\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
  }
  
  
  @Test(threadPoolSize = 3, invocationCount = 3)
  public void m2() {
	  System.out.println("m2 from Test1 class");
	  System.setProperty("webdriver.chrome.driver","D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\31 repo\\EalProject2\\Drivers\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.ebay.com");
  }
}
