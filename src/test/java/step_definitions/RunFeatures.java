package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "json:target/" },
        features = "src/test/java/feature")

public class RunFeatures {


}
