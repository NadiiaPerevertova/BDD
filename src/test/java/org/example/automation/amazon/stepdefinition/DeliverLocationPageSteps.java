package org.example.automation.amazon.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.automation.amazon.pageobject.pages.DeliverLocationPage;
import org.testng.Assert;

public class DeliverLocationPageSteps {
    @Then("User can change delivery location by zip code {string}")
    public void userCanChangeDeliveryLocationByZipCode(String zipCode) {
        DeliverLocationPage deliver = new DeliverLocationPage();
        deliver.enterZipCode(zipCode)
                .apply()
                .confirmApply();
    }

    @Then("User can find {string} in the country list")
    public void userCanFindInTheCountryList(String countryName) {
        DeliverLocationPage deliver = new DeliverLocationPage();
        String presentCountry = deliver
                .countryDropDown()
                .getDeliverCountry(countryName);
        Assert.assertEquals(presentCountry, countryName);
    }

    @And("Select deliver country {string}")
    public void selectDeliverCountry(String countryName) {
        DeliverLocationPage deliver = new DeliverLocationPage();
        String deliveryPlace = deliver
                .selectDeliverCountry(countryName)
                .done()
                .getDeliverLocation(countryName);
        Assert.assertEquals(deliveryPlace, countryName);
    }
}
