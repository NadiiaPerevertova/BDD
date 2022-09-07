package org.example.automation.amazon.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.automation.amazon.pageobject.pages.HomePage;
import org.testng.Assert;

public class HomePageSteps {
    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        HomePage home = new HomePage();
        home.open();
    }

    @When("User click on Deliver to icon")
    public void userClickOnDeliverToIcon() {
        HomePage home = new HomePage();
        home.changeDeliverLocation();
    }

    @And("Delivery location {string} is changed on Home Page")
    public void deliveryLocationIsChangedOnHomePage(String deliveryLocation) {
        HomePage home = new HomePage();
        String deliveryToPlace = home.getDeliverLocation(deliveryLocation);
        Assert.assertEquals(deliveryToPlace, deliveryLocation);
    }

    @And("Choose category {string}")
    public void chooseCategory(String category) {
        HomePage home = new HomePage();
        home.chooseCategory(category);
    }
}
