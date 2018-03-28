package org.cucumber.demoqa.CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/org/cucumber/demoqa/CucumberTest",tags= {"@third","@first"}, glue = { "org\\cucumber\\demoqa\\CucumberTest" }, plugin = {
		"pretty", "html:target/cucumber-html-report" })

public class TestRunner {
	
}
