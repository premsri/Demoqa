package org.cucumber.demoqa.CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature", glue = { "org\\cucumber\\demoqa\\CucumberTest" }, 
tags= {"@textbox,@dropdown,@radio,@checkbox"},
plugin = { "pretty",
		"html:target/cucumber-html-report" })

public class TestRunner {

}
