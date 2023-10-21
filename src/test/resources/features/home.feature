@homeScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @AD-1
  Scenario: Verify the Title of the page
    Then Verify Title of Home page is "ADT® Home Alarm Systems | #1 Smart Alarm Systems Provider"