package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTeliphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	@FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	WebElement msgConfirmation2;
	
	@FindBy(xpath= "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	WebElement msgConfirmation3;
	
	@FindBy(xpath="(//a[normalize-space()='Register'])[2]")
	WebElement clkRegister;
	
	@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	WebElement msgConfirmation4;
	
	@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	WebElement msgConfirmation5;
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);	
	}
	
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);	
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);	
	}
	
	public void setTeliphoneNumber(String telNo) {
		txtTeliphone.sendKeys(telNo);	
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);	
	}
	
	public void setConfirmPassword(String pass) {
		txtConfirmPassword.sendKeys(pass);	
	}
	
	public void setPrimaryPolicy() {
		chkdPolicy.click();	
	}
	
	public void clickContinue() {
		btnContinue.click();	
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public String getConfirmationMsg2() {
		try {
			return (msgConfirmation2.getText());
		} catch (Exception e) {
				return (e.getMessage());
           }
        }
	public String getConfirmationMsg3() {
		try {
			return (msgConfirmation3.getText());
		} catch (Exception e) {
				return (e.getMessage());
           }
        }
	public void ClickRegister() {
		clkRegister.click();
	}
	
	public String getConfirmationMsg4() {
		try {
			return (msgConfirmation4.getText());
		} catch (Exception e) {
				return (e.getMessage());
           }
        }
	
	public String getConfirmationMsg5() {
		try {
			return (msgConfirmation5.getText());
		} catch (Exception e) {
				return (e.getMessage());
           }
        }
	public boolean isFirstNameErrorDisplayed() {
	    return msgConfirmation2.isDisplayed();
	}

	public boolean isLastNameErrorDisplayed() {
	    return msgConfirmation3.isDisplayed();
	}

	public boolean isEmailErrorDisplayed() {
	    return msgConfirmation4.isDisplayed();
	}

	public boolean isTelephoneErrorDisplayed() {
	    return msgConfirmation5.isDisplayed();
	}

	public boolean isAccountCreated() {
	    return msgConfirmation.isDisplayed();
	}

   }


