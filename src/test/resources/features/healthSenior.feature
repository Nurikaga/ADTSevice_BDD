@healthSenioreScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US-22
  Scenario Outline: Verify the page Health & Senior Safety Page top menu text links are displayed
    When I click  "Home & Personal" button
    Then I click on "Health & Senior Safety" button
    Then I change Window to the new tab
    And Verify "<links>" are displayed
    Examples:
      | links            |
      | Products         |
      | Compare Packages |
      | Why ADT          |
      | FAQS             |
      | Testimonials     |