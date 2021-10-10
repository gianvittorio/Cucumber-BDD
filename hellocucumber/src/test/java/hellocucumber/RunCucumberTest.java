package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"hellocucumber.steps"},
        plugin = {"pretty", "json:Report2"},
        dryRun = false,
        monochrome = true,
        name = {"Logo"}
)
public class RunCucumberTest {

}
