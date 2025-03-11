package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/MultipleLogin.feature", glue="stepdefinition", dryRun=false, monochrome=true, plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:reports.html", "json:reports.json"})
public class Execution {

}
