@smallBusinessScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US01
  Scenario:Verify title of the Small Business page
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    Then I verify the title of the page "Business Security Systems & Services | ADT®"

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


  @US03
  Scenario: Verify that user is able to see the a header of the page
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    And I change Window to the new tab
    Then I navigate to "Solutions" drop down menu
    And I click on "Intrusion Detection" link button that takes to the Intrusion Detection page
    Then I change Window to the new tab
    And I verify the header "Professionally-monitored intrusion detection" in the page

  @US04
  Scenario Outline: Verify a header and the links are displayed on Interactive Security page
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    And I change Window to the new tab
    Then I navigate to "Solutions" drop down menu
    Then I navigate to "Interactive Security" drop down menu
    Then I change Window to the new tab
    And I verify the header "Interactive security with automations" in the page
    And Verify  all "<links>" are displayed
    Examples:
      | links              |
      | Remote Arm/Disarm  |
      | Multiple Locations |
      | Climate Control    |
      | Instant Alerts     |
      | Security Cameras   |
      | Lighting Control   |

    @US18
      Scenario: Verify that user is able to see the a header of the page
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    Then I navigate to Accessibility button in the footer and click it
    Then Verify pop-up window with Accessibility menu buttons is display on the right top of the page


  @US20
  Scenario: Verify header text and text under is displayed. 6 pictures with texts an Learn more buttons are displayed
    When I click on Home & Personal button
    And I click on Small Business button
    Then Verify "Customize a business security system today " text in header is displayed
    Then Verify "Your business isn’t just your business. It’s your passion, your way of life. It’s also a livelihood for you and your employees. We can tailor a security solution to help protect it. " text under header is displayed
    Then Verify pictures are displayed
    Then Verify the texts under pictures are displayed
    Then Verify Learn more buttons are displayed


