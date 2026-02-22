package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[text()= 'Search - phone']")
	WebElement msgHeading;
	
	@FindBy(xpath="//img[@title='iPhone']")
		WebElement clikiphoneimg;
	
	public void clickiphoneIMG()
	{
		clikiphoneimg.click();
	}
	
	public boolean isSearchPageExists() {
		try {
		return(msgHeading.isDisplayed());
	} catch(Exception e){
		return false;
	 }
	}
}
