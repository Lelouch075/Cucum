package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		File reportdirectory =new File("C:\\Users\\Jeeva\\eclipse-workspace\\MavenCucu\\src\\test\\resources\\Reports");
		Configuration config =new Configuration(reportdirectory, "Adactin Hotels");
		config.addClassifications("Os", "Windows10");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Sprint", "26");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder reportBuild = new ReportBuilder(jsonFiles, config);
		reportBuild.generateReports();
		
		
		
		
			
			
		
			
		
		
		
	}
}
