package runners;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	       	   features={".//src/test/resources/Features"},
		 	  
			 // features={".//src/test/resources/Features/02Dashboard.feature"},
		     // features={".//FeatureFiles/Array.feature"},
	          //features={".//FeatureFiles/LinkedList.feature"},
		      //features={".//FeatureFiles/Stack.feature"},
		      //features={".//FeatureFiles/Queue.feature"},
		 	  //features={".//FeatureFiles/Tree.feature"},
			  //features={".//FeatureFiles/Graph.feature"},
			  
			  glue = "stepDefinition",
			  plugin = {"pretty", "html:reports/myreport.html", //----Cucumber Report
					  "rerun:target/rerun.txt",

					
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//---Extent Report 
             "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",//--------cucumber Report

					  "timeline:target/timeline" //-----Timeline report
					   },

			  dryRun = false,
			  monochrome = true,
			  publish = true
			  //tags="@sanity"  // this will execute scenarios tagged with @sanity
			  //tags="@Trial"
			  //tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
			  //tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
			  //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression	
			  
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
  
  
}

