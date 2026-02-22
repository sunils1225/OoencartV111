package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.HomePage;
import TestBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass {

	@Test(groups={"Regression", "Master"})
	public void verify_accounregistartion() {
		
	logger.info("***** Starting TC001_AccountRegistrationTest  ****");
	logger.debug("This is a debug log message");
	
	try 
	{
	HomePage hp = new HomePage(driver);	
	
	hp.clickMyAccount();
	logger.info("***** Starting TC001_AccountRegistrationTest  ****");
	
	hp.clickRegister();
	logger.info("Clicked on Register Link.. ");
	
	AccountRegistrationPage Acc = new AccountRegistrationPage (driver);
	
	logger.info("Providing customer details...");
	Acc.setFirstName(randomString().toUpperCase());
	Acc.setLastName(randomString().toUpperCase());
	Acc.setEmail(randomString()+"@gmail.com");
	Acc.setTeliphoneNumber(randomNumber());
	
	String Password = randomAlphaNumeric();
	Acc.setPassword(Password);
	Acc.setConfirmPassword(Password);
	Acc.setPrimaryPolicy();
	Acc.clickContinue();
	
	logger.info("Validating expected message..");
	String ConfirmMsg = Acc.getConfirmationMsg();
	Assert.assertEquals(ConfirmMsg, "Your Account Has Been Created!");
	
	logger.info("Test passed");
	
	}catch(Exception e){
	 logger.error("Test Failed:"+ e.getMessage());
	 logger.debug("Debug failed:"+ e.getMessage());
	 
	}
	finally 
	{
	logger.info("***** Finished TC001_AccountRegistrationTest *****");
	}
  }
}
