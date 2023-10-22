@smallBusinessScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

    @AS03
    Scenario: Verify that user is able to see the a header of the page
      When I click "Home & Personal" hovered-over button
      Then I click on "Small Business" link button that forwarding to the Small Business page
      And I change Window to the new tab
      Then I navigate to "Solutions" drop down menu
      And I click on "Intrusion Detection" link button that takes to the Intrusion Detection page
      Then I change Window to the new tab
      And I verify the header "Professionally-monitored intrusion detection" in the page
