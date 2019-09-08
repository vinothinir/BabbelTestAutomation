package MobileAppTest.Run;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:reports/cucumber-html-report",
                "json:reports/cucumber.json",
                "pretty"},
        //tags = {"@run","~@ignore"},
        features = {"src/test/resources/MobileAppTest"},
        glue = {"MobileAppTest/stepDefinitions"}
)

public class CucumberRunnerMobile {
}
