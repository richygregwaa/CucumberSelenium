package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/GoogleSearch.feature", glue = "stepDefinitions")

public class CucumberRunner {
	

}
