@CommercialScenarios
  Feature: Commercial Scenarios
    Background: Navigate to page
      Given I open url of homepage
      When I click "Home & Personal" hovered-over button
      Then I click on "Commercial" link button that forwarding to the Commercial page

    @US75
    Scenario:Verify nineteen icons are present
      Then I verify that nineteen icons are present