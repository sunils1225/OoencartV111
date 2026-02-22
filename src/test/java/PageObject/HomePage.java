package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super (driver);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement linRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement linkLogin;
	
	@FindBy(xpath = "//input[@name='search']")
	WebElement txtsearchFld;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement searcgbtn;
	
	@FindBy(xpath="//a[normalize-space()='About Us']")
	WebElement clklinktext;
	
	public void clickMyAccount() {
		linkMyAccount.click();
	}
	
	public void clickRegister() {
		linRegister.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}
	
	public void setSearchItem(String srhitem) {
		txtsearchFld.sendKeys(srhitem);	
	}
	
	public void clickSerachBtn() {
		searcgbtn.click();
	}
	
	public void clickLinkText() {
		clklinktext.click();
	}
}
