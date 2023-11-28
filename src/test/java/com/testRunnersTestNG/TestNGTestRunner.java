package com.testRunnersTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features/customer",
		
		
		
//		tags="@Profile_manage_address_add_new_address_page and @back_button",
		
		tags="@Sign_up",
		
		
		
		glue = {"stepDefinitions","com/applicationHooks"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
			"html:target/html_report/cucumber_reports.html",
			"junit:target/junit_report/junit_reports.xml",
			"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
		)
	
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	
}
