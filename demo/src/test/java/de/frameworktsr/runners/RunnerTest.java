package de.frameworktsr.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.core.backend.CucumberBackendException;

@RunWith(Cucumber.class)
@CucumberOptions(
    features={"src/test/resources/de/frameworktsr"},
    glue ={"stepdefinitions","pages","hooks","utils"},
    plugin={"pretty","html:src/test/resources/de/frameworktsr/hooks/report.html"}
)
public class RunnerTest {
    
}
