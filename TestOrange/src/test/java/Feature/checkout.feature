Feature: Guest checkout flow with different payment modes
  Background:
  Scenario: Guest checkout
    Given Add product to cart as guest
    And view checkout page
    When Enter payment details
    Then Place order