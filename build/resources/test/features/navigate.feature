Feature: HomePage
  @navigate
 Scenario: Verify HomePage title is displayed
   Given User launcher Chrome browser
   When User opens ilcarro HomePage
   Then User verifies HomePage title is displayed
    And User closes browser