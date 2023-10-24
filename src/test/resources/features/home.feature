@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @AD-1
  Scenario: Verify the Title of the page
    Then Verify Title of Home page is "ADT® Home Alarm Systems | #1 Smart Alarm Systems Provider"

  @US-05
  Scenario: Verify the Title of Home & Personal page
    When I click on Home & Personal button
    Then Verify the Title of Home & Personal page is "ADT® Home Alarm Systems | #1 Smart Alarm Systems Provider"

  @US-06
  Scenario: Verify ADT logo button
    When I open url of homepage
    Then Verify ADT logo button is displayed

  @US-07
  Scenario: Verify drop down menu is present
    When I open url of homepage
    Then I click on Home & Personal button
    And Verify the drop down menu should be visible

  @US-08
  Scenario Outline: Verify Home & Personal drop down menu text links are displayed & clickable
    When I click on Home & Personal button
    Then Verify "<links>" are displayed
    And Verify "<buttons>" are enable
    Examples:
      | links                  | buttons                |
      | Home & Personal        | Home & Personal        |
      | Small Business         | Small Business         |
      | Health & Senior Safety | Health & Senior Safety |
      | Commercial             | Commercial             |
      | Solar                  | Solar                  |

  @US-09
  Scenario Outline: Verify top menu text links are displayed & enable to click
    When I open url of homepage
    Then Verify "<links>" are displayed
    Then Verify "<buttons>" are enabled
    Then Verify "Shop Now" button is displayed
    And Verify "Shop Now" button is enabled
    Examples:
      | links          | buttons        |
      | Products       | Products       |
      | Packages       | Packages       |
      | Build Your own | Build Your own |
      | Deals          | Deals          |






