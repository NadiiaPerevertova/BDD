package org.example.automation.amazon.stepdefinition;

import io.cucumber.java.en.Then;
import org.example.automation.amazon.pageobject.pages.SearchResultsPage;
import org.testng.Assert;

public class SearchResultsPageSteps {
    @Then("first result should have shipping to {string}")
    public void firstResultShouldHaveShippingTo(String countryName) {
        SearchResultsPage search = new SearchResultsPage();
        String itemDeliveryInfo = search
                .chooseFirstResult()
                .getItemDeliveryLocation();
        Assert.assertEquals(itemDeliveryInfo, "Deliver to " + countryName);
    }
}
