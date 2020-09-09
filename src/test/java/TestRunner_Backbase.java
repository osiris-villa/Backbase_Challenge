

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefs_Backbase" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json" })

public class TestRunner_Backbase extends AbstractTestNGCucumberTests {

}
