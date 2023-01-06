package Facebookwork_TestNG;

import org.testng.annotations.Test;

import Facebook_POM.fbHomepage_POM;
import UtilitiesPack.Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Facebook_SInginTest2 extends Utilities {
	
	
	
  @Test(dataProvider = "facebooklogindata")
  public void facebook_signuptest(String email, String password) throws InterruptedException, IOException {
	 fbHomepage_POM ob= new fbHomepage_POM(driver); 
	 
	 ob.email_fieldAction(email);
	 ob.passfield_action(password);
	 Screenshot_Random();
	 ob.loginbtnclick();
	 Thread.sleep(4000);
	 driver.navigate().back();
	 Thread.sleep(4000);	  
  }

  @DataProvider(name="facebook_Signindata")
  public Object[][] facebooklogindata() {
    return new Object[][] {
      new Object[] { "abc1@gmail", "abc123" },
      new Object[] { "abc2@gmail", "abc234" },
      new Object[] { "abc3@gmail", "abc345" },
      
    };
  }
}
