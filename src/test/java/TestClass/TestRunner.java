package TestClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun=true,

        plugin = {"pretty","html:target/html-report","json:target/cucumber.json"},
        features={"/home/vandanatiwari/IdeaProjects/cucumberProject/src/test/resources/login.feature"}

        ,glue={"TestClass"}
        )


public class TestRunner {


}
