package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.HomePage;
import TestBase.BaseClass;
import Utilities.DataProviders;

public class TC005_AccountRegistrationDDT extends BaseClass{
	@Test(dataProvider="AccountRegistartion", dataProviderClass = DataProviders.class, groups="DataDriven")
	public void verify_AccountRegistrationDDT(String fname, String lname, String email, String pnumber, String pwd, String Cpwd) throws InterruptedException
	{
		logger.info("***** stating TC_005_AccountRegistartion ******");
		try
		{
	
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		//Account Registration
		AccountRegistrationPage Acc = new AccountRegistrationPage (driver);
		Acc.setFirstName(fname);
		Acc.setLastName(lname);
		Acc.setEmail(email);
		Acc.setTeliphoneNumber(pnumber);
		Acc.setPassword(pwd);
		Acc.setConfirmPassword(Cpwd);
		Acc.setPrimaryPolicy();
		Acc.clickContinue();
		
		// ---------- ASSERT CONDITIONS ----------
	    if (fname.isEmpty() || fname.length() > 32) {
	        Assert.assertTrue(Acc.isFirstNameErrorDisplayed(),
	                "First Name error message not displayed");
	    }
	    else if (lname.isEmpty() || lname.length() > 32) {
	        Assert.assertTrue(Acc.isLastNameErrorDisplayed(),
	                "Last Name error message not displayed");
	    }
	    else if (!email.contains("@")) {
	        Assert.assertTrue(Acc.isEmailErrorDisplayed(),
	                "Email error message not displayed");
	    }
	    else if (pnumber.length() < 3 || pnumber.length() > 32) {
	        Assert.assertTrue(Acc.isTelephoneErrorDisplayed(),
	                "Telephone error message not displayed");
	    }
	    else {
	        Assert.assertTrue(Acc.isAccountCreated(),
	                "Account creation success message not displayed");
	    }

		logger.info("Test passed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		Thread.sleep(3000);
		logger.info("***** Finished TC005_AccountRegistrationTest *****");
		
		
	}
}
