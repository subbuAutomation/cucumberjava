package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\selenumintellija\\jayporecuccumber\\src\\test\\Features",
        glue="stepdefinitons",stepNotifications =true)

public class TestRunner {

}
