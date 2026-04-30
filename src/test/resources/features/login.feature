Feature: Login

  @loginPositive
  Scenario: Successful login
    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on login link
    And User enters correct data
    And User clicks on Yalla button
    Then User verifies success message is displayed
    And User closes browser

  @wrongPassword
  Scenario Outline: Login with correct email and incorrect password
    Given User launcher Chrome browser
    When User opens ilcarro HomePage
    And User clicks on login link
    And User enters correct email and incorrect password

      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button

    Then User verifies error message is displayed
    And User closes browser
    Examples:
      | email             | password   |
      | test222@gmail.com | Test123451 |
      | test222@gmail.com | test12345! |
      | test222@gmail.com | TEST12345! |
      | test222@gmail.com | еуые12345! |

