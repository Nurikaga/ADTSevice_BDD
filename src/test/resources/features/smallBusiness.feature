Feature: Small Business related scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US02
  Scenario Outline: Verify Solutions, Industries, Products, Packages, Risk Assessment, and Resources buttons in the header are displayed, & enable to click
    When I click on Home & Personal button
    And I click on Small Business button
    Then Verify "<links>" are displayed
    Then Verify "<buttons>" are enabled
    Examples:
      | links           | buttons         |
      | Solutions       | Solutions       |
      | Industries      | Industries      |
      | Products        | Products        |
      | Packages        | Packages        |
      | Risk Assessment | Risk Assessment |
      | Resources       | Resources       |