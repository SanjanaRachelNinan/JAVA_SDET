package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/mercurytours.feature",glue= {"stepDefinitions"},
monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
