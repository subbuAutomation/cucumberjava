package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/Features",
        glue="stepdefinitons",plugin = {"pretty","html:target/cucumberreport.html"})
public class Testngruunner extends AbstractTestNGCucumberTests {

}
