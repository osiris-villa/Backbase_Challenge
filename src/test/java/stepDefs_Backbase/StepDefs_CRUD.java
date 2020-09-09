package stepDefs_Backbase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects_Bb.ComputerDetails_PageObject;
import pageObjects_Bb.ListPage;

public class StepDefs_CRUD {

	/*
	 * Use of composition to access the methods in another classes
	 */
	WebDriver driver;
	ServiceHooks serviceHooks = new ServiceHooks();
	ListPage listPage;
	ComputerDetails_PageObject computerDetails;

	/*
	 * Use of constructor to initialize the classes
	 */
	public StepDefs_CRUD() {
		this.driver = serviceHooks.getDriver();
		listPage = new ListPage(driver);
		computerDetails = new ComputerDetails_PageObject(driver);
	}

	@Given("^I Navigate to \"([^\"]*)\"$")
	public void i_Navigate_to(String baseUrl) {
		driver.get(baseUrl);
	}

	@When("^I want to add a new computer$")
	public void i_want_to_add_a_new_computer() {
		Assert.assertTrue(listPage.addNewComputer(), "- Add a new computer button has not been cliked");
	}

	@And("^I enter details: Computer name \"([^\"]*)\" and Introduced date \"([^\"]*)\" and Discontinued date \"([^\"]*)\" and Company \"([^\"]*)\"$")
	public void i_enter_details_Computer_name_Introduced_date_Discontinued_date_and_Company(String computerName,
			String introducedDate, String discontinuedDate, String company) {
		Assert.assertTrue(computerDetails.createNewComputer(computerName, introducedDate, discontinuedDate, company),
				"- Computer has not been added");
	}

	@Then("^I validate the computer \"([^\"]*)\" has been \"([^\"]*)\"$")
	public void i_validate_the_computer_has_been_added(String computerName, String status) {
		if (status.equals("deleted")) {
			Assert.assertEquals("Done! Computer has been " + status, listPage.getAlertText());
		} else {
			Assert.assertEquals("Done! Computer " + computerName + " has been " + status, listPage.getAlertText());
		}
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String computerName) {
		Assert.assertTrue(listPage.searchForComputer(computerName));
	}

	@Then("^I validate \"([^\"]*)\" is present$")
	public void i_validate_is_present(String computerName) {
		Assert.assertTrue(listPage.verifyComputerIsPresent(computerName));
	}

	@And("^Open the \"([^\"]*)\" details$")
	public void open_the_details(String computerName) {
		listPage.openComputerDetails(computerName);
	}

	@And("^I delete the computer$")
	public void i_delete_the_computer() {
		Assert.assertTrue(computerDetails.deleteComputer());

	}

}
