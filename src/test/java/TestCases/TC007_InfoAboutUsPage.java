package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AboutInfoPage;
import PageObject.HomePage;
import TestBase.BaseClass;

public class TC007_InfoAboutUsPage extends BaseClass{

    @Test(groups={"Regression", "Master"})
    public void verify_AboutinfoPage (){

	logger.info("*****  Starting TC007_InfoAboutUsPage  ****");
	logger.info("*****  Home page open  ****");
	
	try 
	{
	HomePage hp = new HomePage(driver);
	hp.clickLinkText();
	
	logger.info("*****  About Us page open  ****");
	AboutInfoPage about = new AboutInfoPage(driver);
	logger.info("Validating expected message..");
	boolean target = about.isAboutUS();
	Assert.assertEquals(target, true, "About Us");
	
	logger.info("Test passed");
	
    }catch(Exception e){
    logger.error("Test Failed:"+ e.getMessage());
    logger.debug("Debug failed:"+ e.getMessage());
 
    }
    finally 
    {
    logger.info("***** Finished TC007_InfoAboutUsPage *****");
     }
    }
   }
