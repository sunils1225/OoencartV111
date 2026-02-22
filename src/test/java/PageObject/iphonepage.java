package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iphonepage extends BasePage {
	public iphonepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-exchange']")
	WebElement clickCompareProductList;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement getsucessmsg;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement clkaddcartbtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement clkiphoneproduct;

	
	public void clickAddtoCartbtn()
	{
		clkaddcartbtn.click();
	}
	
	public void clickCompareProductbtn()
	{
		clickCompareProductList.click();
	}
	
	public String getSuccessMessage() {
	    return getsucessmsg.getText();
	}
	
	public void clickiphoneproduct()
	{
		clkiphoneproduct.click();
	}
}
