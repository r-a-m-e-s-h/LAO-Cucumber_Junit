package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/FeatureFile-Folder/Login.feature",

		glue= {"Step_Definitions"},
		
		dryRun=true,
	
		monochrome = true
		
		//plugin = {"pretty", "html:target/HTMLReports/report.html"},
		//plugin = {"pretty" , "html:target/HTMLReports/report.html" , 
				//"json:target/JSONReports/report.json" ,"junit:target/XMLReports/report.xml" }
		
		//tags = "@Test"
		
		)

public class RunnerClass {

}
// Cucumber-Options
/*
features,
glue,
dryRun,
strict,
tags,
monochrome,
plugin
*/
