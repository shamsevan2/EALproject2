package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verymerry_Page {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='nav-subnav'] /descendant::span[2]") WebElement coupons;
	
	public void couponsclick() {
		coupons.click();
	}
	
	public Verymerry_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
