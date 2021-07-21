import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
			features="",
			glue="steps",
			dryRun=false,
			monochrome=true,
			strict = false,
			plugin = {
					"pretty",
					"html:src/test/resources/relatorios/cucumber-reports/",
					"json:src/test/resources/relatorios/cucumber-reports/cucumber.json",
					"junit:src/test/resources/relatorios/cucumber-reports/cucumber-reports/Cucumber.xml" }
		
			)
public class RunTests {

}
