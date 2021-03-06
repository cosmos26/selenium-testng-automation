package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-report", "json:target/cucumber.json",
		"rerun:target/rerun.txt" }, tags = "@AddEmployeeTests", features = {
				"src/test/resources/features/" }, glue = "com/app/step_definitions/", dryRun = true)

public class CukesRunner extends AbstractTestNGCucumberTests {

}