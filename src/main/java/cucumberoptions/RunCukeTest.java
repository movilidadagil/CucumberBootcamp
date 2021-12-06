package cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
          features = "src/main/resources/features",
        glue = "steps",
           plugin = {
                "pretty", "html:target/cucumber-html-reports", "io.qameta.allure.cucumberjvm.AllureCucumberJvm",
        }
)

public class RunCukeTest {

}
