package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepdefinition"},monochrome =true, dryRun=false, plugin= {"pretty",
		"json:src/test/resources/Reports/output.json"})

public class TestRunner {
	@AfterClass
	public static void afterClass() {
		
		Reporting.generateJvmReport("C:\\Users\\Jeeva\\eclipse-workspace\\MavenCucu\\src\\test\\resources\\Reports\\output.json");
		System.out.println("Goa");
		
	}
	
	
	

}
