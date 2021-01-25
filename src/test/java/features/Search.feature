Feature: Search and place order for Vegetables

  @SmokeTest
  Scenario: Search for items and validate results
    Given User is on Greencart landing page
    When User searches for Cucumber Vegetables
    #Change parameter to reuse this line
    Then verify selected Cucumber is displayed in Checkout page
    #Change parameter to reuse this list


  @RegressionTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on Greencart landing page
    When User searches for <name> Vegetables
    And User adds item to cart
    And User proceeded to Checkout page for purchase
    Then verify selected <name> is displayed in Checkout page
    #Change parameter to reuse this list
  Examples:
    | name |
    | Brinjal |
    | Beetroot|