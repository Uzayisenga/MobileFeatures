package de.frameworktsr.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features={"src/test/resources/features/"},
    glue ={"de.frameworktsr.stepdefinitions","de.frameworktsr.pages","de.frameworktsr.hooks","de.framweworktsr.utils"},
    plugin = { "pretty", "html:target/reports/html-report.html", "json:target/reports/json-report.json" },tags ="@scrollupdown")

public class RunnerTest {
    
}
