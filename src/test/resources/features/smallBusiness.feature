 Nurik
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

@smallBusinessScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage
    @AS01
      Scenario:Verify title of the Small Business page
        When I click "Home & Personal" hovered-over button
        Then I click on "Small Business" link button that forwarding to the Small Business page
        Then I verify the title of the page "Business Security Systems & Services | ADT®"

  @AS03
    Scenario: Verify that user is able to see the a header of the page
      When I click "Home & Personal" hovered-over button
      Then I click on "Small Business" link button that forwarding to the Small Business page
      And I change Window to the new tab
      Then I navigate to "Solutions" drop down menu
      And I click on "Intrusion Detection" link button that takes to the Intrusion Detection page
      Then I change Window to the new tab
      And I verify the header "Professionally-monitored intrusion detection" in the page
main
