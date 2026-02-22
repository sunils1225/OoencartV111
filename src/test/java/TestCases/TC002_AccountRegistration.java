package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.HomePage;
import TestBase.BaseClass;

public class TC002_AccountRegistration extends BaseClass{
	@Test (priority = 1)
	public void verify_accounregistartion() {
		
	logger.info("***** Starting TC002_AccountRegistrationTest  ****");
	logger.debug("This is a debug log message");
	
	try 
	{
	HomePage hp = new HomePage(driver);	
	
	hp.clickMyAccount();
	logger.info("***** Starting TC002_AccountRegistrationTest  ****");
	
	hp.clickRegister();
	logger.info("Clicked on Register Link.. ");
	
	AccountRegistrationPage Acc = new AccountRegistrationPage (driver);
	
	logger.info("Providing customer details...");
	Acc.setLastName(randomString().toUpperCase());
	Acc.setEmail(randomString()+"@gmail.com");
	Acc.setTeliphoneNumber(randomNumber());
	
	String Password = randomAlphaNumeric();
	Acc.setPassword(Password);
	Acc.setConfirmPassword(Password);
	Acc.setPrimaryPolicy();
	Acc.clickContinue();
	
	logger.info("Validating expected message..");
	String ConfirmMsg = Acc.getConfirmationMsg2();
	Assert.assertEquals(ConfirmMsg, "First Name must be between 1 and 32 characters!");
	
	logger.info("Test passed");
	Acc.ClickRegister();
	
	}catch(Exception e){
	 logger.error("Test Failed:"+ e.getMessage());
	 logger.debug("Debug failed:"+ e.getMessage());
	 
	  }
	
	
	}
	
	@Test (priority = 1)
	public void verify_accounregistartion2() {
		logger.info("***** Starting TC002_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
		
		try 
		{
		HomePage hp = new HomePage(driver);	
		
		hp.clickMyAccount();
		logger.info("***** Starting TC002_AccountRegistrationTest  ****");
		
		hp.clickRegister();
		logger.info("Clicked on Register Link.. ");
		
		AccountRegistrationPage Acc = new AccountRegistrationPage (driver);
		
		logger.info("Providing customer details...");
		Acc.setFirstName(randomString().toUpperCase());
		//Acc.setLastName(randomString().toUpperCase());
		Acc.setEmail(randomString()+"@gmail.com");
		Acc.setTeliphoneNumber(randomNumber());
		
		String Password = randomAlphaNumeric();
		Acc.setPassword(Password);
		Acc.setConfirmPassword(Password);
		Acc.setPrimaryPolicy();
		Acc.clickContinue();
		
		logger.info("Validating expected message..");
		String ConfirmMsg = Acc.getConfirmationMsg3();
		Assert.assertEquals(ConfirmMsg, "Last Name must be between 1 and 32 characters!");
		
		logger.info("Test passed");
		Acc.ClickRegister();
		
		}catch(Exception e){
		 logger.error("Test Failed:"+ e.getMessage());
		 logger.debug("Debug failed:"+ e.getMessage());
		 
		}
	}
		@Test (priority = 1)
		public void verify_accounregistartion3() {
			logger.info("***** Starting TC002_AccountRegistrationTest  ****");
			logger.debug("This is a debug log message");
			
			try 
			{
			HomePage hp = new HomePage(driver);	
			
			hp.clickMyAccount();
			logger.info("***** Starting TC002_AccountRegistrationTest  ****");
			
			hp.clickRegister();
			logger.info("Clicked on Register Link.. ");
			
			AccountRegistrationPage Acc = new AccountRegistrationPage (driver);
			
			logger.info("Providing customer details...");
			Acc.setFirstName(randomString().toUpperCase());
			Acc.setLastName(randomString().toUpperCase());
			//Acc.setEmail(randomString()+"@gmail.com");
			Acc.setTeliphoneNumber(randomNumber());
			
			String Password = randomAlphaNumeric();
			Acc.setPassword(Password);
			Acc.setConfirmPassword(Password);
			Acc.setPrimaryPolicy();
			Acc.clickContinue();
			
			logger.info("Validating expected message..");
			String ConfirmMsg = Acc.getConfirmationMsg4();
			Assert.assertEquals(ConfirmMsg, "E-Mail Address does not appear to be valid!");
			
			logger.info("Test passed");
			Acc.ClickRegister();
			
			}catch(Exception e){
			 logger.error("Test Failed:"+ e.getMessage());
			 logger.debug("Debug failed:"+ e.getMessage());
			 
			}
		}
			@Test (priority = 1)
			public void verify_accounregistartion4() {
				logger.info("***** Starting TC002_AccountRegistrationTest  ****");
				logger.debug("This is a debug log message");
				
				try 
				{
				HomePage hp = new HomePage(driver);	
				
				hp.clickMyAccount();
				logger.info("***** Starting TC002_AccountRegistrationTest  ****");
				
				hp.clickRegister();
				logger.info("Clicked on Register Link.. ");
				
				AccountRegistrationPage Acc = new AccountRegistrationPage (driver);
				
				logger.info("Providing customer details...");
				Acc.setFirstName(randomString().toUpperCase());
				Acc.setLastName(randomString().toUpperCase());
				Acc.setEmail(randomString()+"@gmail.com");
				//Acc.setTeliphoneNumber(randomNumber());
				
				String Password = randomAlphaNumeric();
				Acc.setPassword(Password);
				Acc.setConfirmPassword(Password);
				Acc.setPrimaryPolicy();
				Acc.clickContinue();
				
				logger.info("Validating expected message..");
				String ConfirmMsg = Acc.getConfirmationMsg5();
				Assert.assertEquals(ConfirmMsg, "Telephone must be between 3 and 32 characters!");
				
				logger.info("Test passed");
				Acc.ClickRegister();
				
				}catch(Exception e){
				 logger.error("Test Failed:"+ e.getMessage());
				 logger.debug("Debug failed:"+ e.getMessage());
				 
				}

	finally 
	{
	logger.info("***** Finished TC002_AccountRegistrationTest *****");
	}
  }
}