package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\Features\\Rediff.feature" }, glue = {"Steps","Hooks"} ,plugin = { "pretty",
		"html:src\\test\\resources\\Reports\\cucumber-reports.html",
		"json:src\\test\\resources\\Reports\\json-reports.json",
		"junit:src\\test\\resources\\Reports\\junit-reports.xml" })


public class RediffRunner extends AbstractTestNGCucumberTests {
}
