@videoSurveillanceScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    And I change Window to the new tab
    Then I navigate to "Solutions" drop down menu
    Then I navigate to "Video Surveillance" drop down menu
    Then I change Window to the new tab

  @US16 @smoke
  Scenario: Verify a header,pictures, titles and texts on the page
    Then I verify the header "A high-tech window into your business" in the page
    And I verify the image,title,text is displayed
    And I take screenshot of test
