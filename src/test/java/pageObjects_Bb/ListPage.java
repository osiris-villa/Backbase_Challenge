package pageObjects_Bb;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefs_Backbase.ServiceHooks;

/**
 * Elements located in the List of computers section and their manipulation
 **/

public class ListPage extends BasePage_Bb {

	WebDriver driver;
	WebDriverWait wait;

	// ------- ELEMENTS -------

	@FindBy(id = "add")
	WebElement btnAddComputer;

	@FindBy(css = ".alert-message")
	WebElement alertMessage;

	@FindBy(id = "searchbox")
	WebElement txtSearchBox;

	@FindBy(id = "searchsubmit")
	WebElement btnFilterByName;

	@FindBy(tagName = "a")
	List<WebElement> tblComputers;

	public ListPage(WebDriver driver) {
		this.driver = ServiceHooks.driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

	// ------- METHODS -------

	public boolean addNewComputer() {
		try {
			waitForElementToBeCliackable(btnAddComputer, 5);
			clickOnElement(btnAddComputer);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}

	public String getAlertText() {
		return getText(alertMessage);
	}

	public boolean searchForComputer(String computerName) {
		try {
			waitForElement(txtSearchBox, 5);
			enterText(txtSearchBox, computerName);
			clickOnElement(btnFilterByName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}

	public boolean verifyComputerIsPresent(String computerName) {
		try {
			for (int i = 0; i < tblComputers.size(); i++) {
				System.out.println(tblComputers.get(i).getText());

				if (tblComputers.get(i).getText().equals(computerName)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		return false;
	}

	public void openComputerDetails(String computerName) {
		try {
			for (int i = 0; i < tblComputers.size(); i++) {
				System.out.println(tblComputers.get(i).getText());

				if (tblComputers.get(i).getText().equals(computerName)) {
					clickOnElement(tblComputers.get(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

}
