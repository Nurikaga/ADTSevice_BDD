@accessControlScenarios @regression
Feature: Access Control Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page
    And I change Window to the new tab
    Then I navigate to "Solutions" drop down menu
    And I click on "Access Control" link button that takes to the Access Control page

  @US10
  Scenario: Verify a user able to fill out a form and specialist will contact back
    When I verify the header "Get a FREE Security Assessment" in the page
    Then I verify a text "Fill out this form and an ADT specialist will contact you to discuss ADT security solutions." in the page
    And I verify the select box is clickable and has the following options
    When the user fills out the form with the following data
      | Field                | Value               |
      | Customer_Full_Name   | Tom Bull            |
      | Business_Name        | Kenny               |
      | E_Mail_Address       | someone@someone.com |
      | Phone_Number_Primary | 234-456-2345        |
      | Postal_Code          | 34826               |
    And I verify the button "Call Me Back" in the page clickable and takes to the new page
    And I verify the Message is displayed in the pop-up window