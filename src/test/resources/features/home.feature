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

  @US-09
  Scenario Outline: Verify top menu text links are displayed & enable to click
    When I open url of homepage
    Then Verify "<links>" are displayed
    And Verify "<buttons>" are enabled
    Examples:
      | links          | buttons        |
      | Products       | Products       |
      | Packages       | Packages       |
      | Build Your own | Build Your own |
      | Deals          | Deals          |
      | Shop Now       | Shop Now       |

