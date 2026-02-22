package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
WebDriver driver;
WebDriverWait wait;

public BasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
}
public void waitForElementToBeClickable(WebElement element) {
    wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void waitForSeconds(int seconds) {
    try {
        Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }
}
