package com.fourstay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
<<<<<<< HEAD

@CucumberOptions(
		plugin = "html:target/cucumber-reports",
		features = "src/test/resources/features", 
		glue = "com/fourstay/step_definitions", 
		tags = "@Staytest_125",
		dryRun = false
		
		)

=======
@CucumberOptions(
		plugin = "html:target/cucumber-reports",
		features = "src/test/resources/features", 
		glue = "com/fourstay/step_definitions", 
		tags = "@Staytest_125",
		dryRun = true
		
		)
>>>>>>> branch 'master' of https://github.com/cbttestuser1/automation-project-test.git
public class CukesRunner {

}
