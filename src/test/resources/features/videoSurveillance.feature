@videoSurveillanceScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US16
  Scenario: Verify a header,pictures, titles and texts on the page
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    And I change Window to the new tab
    Then I navigate to "Solutions" drop down menu
    Then I navigate to "Video Surveillance" drop down menu
    And I change Window to the new tab
    Then I verify the header "A high-tech window into your business" in the page
    And I verify the pictures, titles, and texts are displayed in the page

