package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features="src/test/java/feature")
@RunWith(Cucumber.class)
public class RunCukeTestIT {
}
