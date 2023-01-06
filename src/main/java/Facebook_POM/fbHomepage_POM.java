package Facebook_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbHomepage_POM {
public WebDriver driver;

@FindBy(name = "email") WebElement email_field;
@FindBy(name = "pass") WebElement pass_field;
@FindBy(name="login") WebElement login_btn;


   public void email_fieldAction(String email) throws InterruptedException{
	   email_field.click();
	   email_field.clear();
	   email_field.sendKeys(email);
	   Thread.sleep(1000);
	   
   }
   
   public void passfield_action(String password) throws InterruptedException {
	   pass_field.click();
	   pass_field.sendKeys(password);
	   Thread.sleep(1000);
   }
   
   
   public void loginbtnclick() throws InterruptedException {
	   login_btn.click();
	   Thread.sleep(1000);
   }
   
   
   public fbHomepage_POM(WebDriver driver) {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
   }
   


   
   
   

}
