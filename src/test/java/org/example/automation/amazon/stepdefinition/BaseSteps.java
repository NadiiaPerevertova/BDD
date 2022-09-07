package org.example.automation.amazon.stepdefinition;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseSteps {
    @Before
    public void setup() {
        Configuration.baseUrl = "https://www.amazon.com";
        Configuration.browser = "chrome";
    }

    @After
    public void close() {
        closeWebDriver();
    }

}
