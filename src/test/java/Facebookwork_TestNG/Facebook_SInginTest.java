package Facebookwork_TestNG;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL;

import Facebook_POM.fbHomepage_POM;
import UtilitiesPack.Utilities;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class Facebook_SInginTest extends Utilities {
	
	
	
  @Test(dataProvider = "fblogindata")
  public void facebook_signuptest(String email, String password) throws InterruptedException, IOException {
	 fbHomepage_POM ob= new fbHomepage_POM(driver); 
	 
	 ob.email_fieldAction(email);
	 ob.passfield_action(password);
	 ob.loginbtnclick();
	 Thread.sleep(4000);
	 driver.navigate().back();
	 Thread.sleep(4000);
		
  }

  @DataProvider(name = "fblogindata")
  public Object[][] facebooklogindata() {
    return new Object[][] {
      new Object[] { "abc1@gmail", "abc123",},
      new Object[] { "abc2@gmail", "abc234" },
      new Object[] { "abc3@gmail", "abc345" },
      
    };
  }
    
    @DataProvider(name = "signupdatefb")
    public Object[][] signup() {
    	
    	String ud=System.getProperty("user.dir");
String Excelfilepath = ud+"\\TestData\\testdata.xlsx";
		
		Xlsx_Reeader_EAL reader = new Xlsx_Reeader_EAL(Excelfilepath);
    	//get all data 
		Object[][] data=reader.getSheetData("fb");
		return data;
		
		
      }
}
