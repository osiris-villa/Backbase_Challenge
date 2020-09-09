package pageObjects_Bb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefs_Backbase.ServiceHooks;

/**
 * Common actions used. Offers better readability an clear understanding
 */

public abstract class BasePage_Bb {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage_Bb() {
		this.driver = ServiceHooks.driver;
		PageFactory.initElements(driver, this);
	}

	protected void clickOnElement(WebElement anElement) {
		anElement.click();
	}

	protected void enterText(WebElement anElement, String keysToSend) {
		anElement.clear();
		anElement.sendKeys(keysToSend);
	}

	protected String getText(WebElement anElement) {
		return anElement.getText();
	}

	public void waitForElement(WebElement anElement, int time) {
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(anElement));
	}

	public void waitForElementToBeCliackable(WebElement anElement, int time) {
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(anElement));
	}

	protected void selectFromDropdown(WebElement anElement, String value) {
		Select dropdown = new Select(anElement);
		dropdown.selectByVisibleText(value);
	}

	protected boolean elementIsPresent(WebElement anElement) {
		return anElement.isDisplayed();
	}

}
