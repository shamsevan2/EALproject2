package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage {
	WebDriver driver;
	
	//element loacate section
	@FindBy(id = "twotabsearchtextbox") WebElement searchbar;
	@FindBy(xpath = "//a[text()='Very Merry Deals']" ) WebElement verymerrydeals;
	@FindBy(id = "nav-search-submit-button") WebElement searchicon;
	
	
	
	//action methods
	public void sendkeysonSearchbar(String searchitem) {
		searchbar.click();
		searchbar.clear();
		searchbar.sendKeys(searchitem);
	}
	
	public void verymerryclick() {
		verymerrydeals.click();
	}
	
	public void searchicon_click() {
		searchicon.click();
	}
	
	
	public AmazonHomepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}

}
