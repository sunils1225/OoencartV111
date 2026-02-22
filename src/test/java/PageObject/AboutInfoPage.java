package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutInfoPage extends BasePage {
	public AboutInfoPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='About Us']")
	WebElement headerText;
	
	public boolean isAboutUS() {
		try {
		return(headerText.isDisplayed());
	} catch(Exception e){
		return false;
	 }
	}
}
