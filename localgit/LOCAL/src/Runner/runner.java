package Runner;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "Feature",
glue={"stepDefinition"}
)

public class runner {

}
