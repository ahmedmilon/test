package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
              features = "src/test/java/Feature",
              glue="stepdefination", 
              plugin = {"Pretty" , "html:target/cucumber"})
public class TestRunner{
}

