package AmazonTestNG1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AmazonPOM.AmazonHomepage;
import AmazonPOM.Coupons_Page;
import AmazonPOM.Verymerry_Page;
import AmazonPOM.mostpopular_page;
import UtilitiesPack.Utilites2;
import UtilitiesPack.Utilities;

public class Amazon2 extends Utilites2 {
  @Test(priority = 1)
  public void f() throws IOException {
	  
	  AmazonHomepage ob= new AmazonHomepage(driver);
	  ob.sendkeysonSearchbar("computer");
	  
	  
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  
	  String frsHomepageURL= "https://www.amazon1.com/";
	  
//	  Assert.assertEquals(url, frsHomepageURL);
	  SoftAssert sft= new SoftAssert();
	  sft.assertEquals(url,frsHomepageURL);
	  
	  System.out.println("this is aftr assertion");
	  
	  
		/*
		 * ob.verymerryclick();
		 * Verymerry_Page vp= new Verymerry_Page(driver); vp.couponsclick();
		 * Coupons_Page cp= new Coupons_Page(driver); cp.mostpopularClick();
		 */
	  sft.assertAll();
  
  }
  
  @Test(priority = 2)
  public void test2() {
	  
	  mostpopular_page mp= new mostpopular_page(driver);
	  mp.logoclick();
	  
	  
	  AmazonHomepage ob= new AmazonHomepage(driver);
	  ob.sendkeysonSearchbar("computer");
	  
	  
	  ob.searchicon_click();
	  	  
  }
	
  
}
