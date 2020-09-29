package demo.spring.selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
		features = "src/test/resources/features",
		glue= "demo/spring/selenium/stepdefinitions",
		dryRun= false ,
		plugin = {
				"pretty",
				"html:build/test-results/html-report.html",
				"json:build/test-results/json-report.json"
		},
		monochrome = true //,
		//tags = {"@imp2,@imp"} //run @imp2  OR @imp runs scenarios if it finds any of these tags on a scenario 
		//tags = {"@imp2","@imp"} //run @imp2  AND @imp runs sceanrios which has both the tags
		//tags = {"@FunctionalTest","@imp"} //runs scenarios which are both tagged @functionalTest and @imp . 
										//	Note: @FunctionalTest is marked for the whole feature in datadriven.feature
		//tags = {"@FunctionalTest","~@imp"} //runs scenarios which are @functionalTest but not tagged as @imp in datadriven.feature
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{ //for testng

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}

