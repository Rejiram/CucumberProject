Feature: Login
  @Smoke
  Scenario: Login successful flow
    Given Access login page
    When Enter user name "hello"
    And Enter password "pwd"
    Then Validate my account page
@Sanity
  Scenario: Add to cart flow
    Given View PLP
    When Click on Product
    And Click on Add to Cart
    Then Validate cart page

