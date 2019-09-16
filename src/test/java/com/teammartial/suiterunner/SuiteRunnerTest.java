package com.teammartial.suiterunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features", glue = "com.teammartial.stepdefinitions", plugin = {
		"json:target/cucumber-report/cucumber.json"	})
public class SuiteRunnerTest {

}
