package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mostpopular_page {
	WebDriver driver;
	
	@FindBy (id = "nav-logo-sprites") WebElement logo; 
	
	public void logoclick() {
		logo.click();
		
	}
	
	public mostpopular_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	

}
