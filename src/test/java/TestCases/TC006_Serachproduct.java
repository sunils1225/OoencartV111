package TestCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.ProductDetailPage;
import PageObject.SearchPage;
import PageObject.iphonepage;
import TestBase.BaseClass;

public class TC006_Serachproduct extends BaseClass {

	@Test(groups = {"Sanity", "Master"})
	public void verify_searchproduct () {
	try 
	{
	logger.info("*****  Starting TC006_Searchproduct  ****");
	logger.info("*****  Home page open  ****");
	HomePage hp = new HomePage(driver);
	hp.setSearchItem("phone");
	hp.clickSerachBtn();
	logger.info("*****  Search the item   ****");
	SearchPage sc = new SearchPage(driver);
	boolean target = sc.isSearchPageExists();
	Assert.assertEquals(target, true, "Login Failed");
	sc.clickiphoneIMG();
	
	iphonepage ip = new iphonepage(driver);
	ip.clickCompareProductbtn();
	String ActualMsg = ip.getSuccessMessage();
	Assert.assertTrue(ActualMsg.contains("Success: You have added iPhone to your product comparison!"),
	                                      "Success message is NOT displayed correctly");
	Thread.sleep(5000);
    ip.clickiphoneproduct();
    
    ProductDetailPage proDetail = new ProductDetailPage(driver);
    proDetail.clickmainproductimg();
    proDetail.viewProductImages(5);
	}
	catch (Exception e) {
	Assert.fail();
	}
	  finally 
	{
		logger.info("***** Finished TC006_Searchproduct *****");
	}
  }
}
