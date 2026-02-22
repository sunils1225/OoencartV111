package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='product-product']//li[1]//a[1]//img[1]")
	WebElement clkmainproduct;
	
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")
	WebElement clkNextarrowbtn;
	
	public void clickmainproductimg()
	{
		  waitForElementToBeClickable(clkmainproduct);
		  clkmainproduct.click();
	}
	public void viewProductImages(int slideCount) {
        for (int i = 1; i <= slideCount; i++) {
            try {
                waitForElementToBeClickable(clkNextarrowbtn);
                clkNextarrowbtn.click();
                waitForSeconds(1);
            } catch (Exception e) {
                System.out.println("Reached last slide image");
                break;
            }
        }
	}
}
