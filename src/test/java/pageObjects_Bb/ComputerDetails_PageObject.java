package pageObjects_Bb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefs_Backbase.ServiceHooks;

/**
 * Elements located in the Computer deatils section and their manipulation
 **/

public class ComputerDetails_PageObject extends BasePage_Bb {

	WebDriver driver;
	WebDriverWait wait;

	// ------- ELEMENTS -------

	@FindBy(id = "name")
	WebElement txtComputerName;

	@FindBy(id = "introduced")
	WebElement txtIntroducedDate;

	@FindBy(id = "discontinued")
	WebElement txtDiscontinuedDate;

	@FindBy(id = "company")
	WebElement ddCompany;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnCreateThisComputer;

	@FindBy(xpath = "//input[@class='btn danger']")
	WebElement btnDeleteThisComputer;

	public ComputerDetails_PageObject(WebDriver driver) {
		this.driver = ServiceHooks.driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	// ------- METHODS -------

	public boolean createNewComputer(String name, String introduced, String discontinued, String company) {
		try {
			waitForElement(txtComputerName, 5);
			enterText(txtComputerName, name);
			enterText(txtIntroducedDate, introduced);
			enterText(txtDiscontinuedDate, discontinued);
			selectFromDropdown(ddCompany, company);
			clickOnElement(btnCreateThisComputer);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}

	public boolean deleteComputer() {
		try {
			waitForElement(btnDeleteThisComputer, 5);
			clickOnElement(btnDeleteThisComputer);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
