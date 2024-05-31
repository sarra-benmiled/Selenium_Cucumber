package com.e2eTests.automation;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/cucumber-report.html"},
		tags = ("@login"),
		//glue ={"src/test/java/com/e2eTests/automation/step_definition"},
		monochrome=false,
		snippets=CAMELCASE
		)

public class RunWebSuiteTest {

}