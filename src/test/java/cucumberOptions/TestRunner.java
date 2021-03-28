package cucumberOptions;

//feature
//provide both locations (feature and java describe)

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue ="stepDefinitions",
        strict = true,
        //tags = {"@WebTest or @MobileTest"}
        tags = "@WebTest",
        //step definition file
        //dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cookies.xml"}
)

public class TestRunner {


}
