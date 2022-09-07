package org.example.automation.amazon;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}