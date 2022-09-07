Feature: Delivery to functionality
  Scenario: Verify delivery location changing
    Given User is on Home Page
    When User click on Deliver to icon
    Then User can change delivery location by zip code "95814"
    And Delivery location "Sacramento 95814‌" is changed on Home Page

  Scenario: Verify country present
    Given User is on Home Page
    When User click on Deliver to icon
    Then User can find "Poland" in the country list

  Scenario: Verify delivery of selected product
    Given User is on Home Page
    When User click on Deliver to icon
    And Select deliver country "Australia"
    And Choose category "Chairs"
    Then first result should have shipping to "Australia"