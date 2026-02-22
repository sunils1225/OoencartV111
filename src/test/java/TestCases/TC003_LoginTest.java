package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import TestBase.BaseClass;

public class TC003_LoginTest extends BaseClass {

	//@Test (priority = 1)
	@Test(groups = {"Sanity", "Master"})
    public void verify_login() {
    try	
    {
    logger.info("***** Starting TC003_LoginTestTest  ****");
    
    HomePage hp = new HomePage(driver);
    
	hp.clickMyAccount();
	logger.info("***** Clicked MyAccount link  ****");
	
	hp.clickLogin();
	logger.info("Clicked on Login Link.. ");
	
	logger.info("Enter the Login details.. ");
	LoginPage lp = new LoginPage(driver);
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	lp.clkLogin();
	
	
	MyAccountPage macc = new MyAccountPage(driver);
	boolean target = macc.isMyAccountPageExists();
	Assert.assertEquals(target, true, "Login Failed");
    }
    
    catch (Exception e) {
    	Assert.fail();
    }
    finally 
	{
	logger.info("***** Finished TC003_LoginTest *****");
	}
   } 
}
