package stepDefs_Backbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceHooks {

	public static WebDriver driver;

	public String getData(String data) throws IOException {

		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("./global.properties");
		properties.load(fis);
		return properties.getProperty(data);
	}

	@Before
	public void initializeTest() throws IOException {

		String browserName = getData("browser");

		switch (browserName) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			throw new IllegalArgumentException();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After
	public void terminateTest(Scenario scenario) {

		// Take Screenshot and put it in the report
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png"); // stick it in the report
		driver.quit();
	}
}
