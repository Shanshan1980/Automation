package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//feature
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",  // find the to be executed Gherkin line 
		glue="stepDefinition")  // glue is the name of the package, where all the stepDefinitions saved.
//stepDefination
public class TestRunner {

}
