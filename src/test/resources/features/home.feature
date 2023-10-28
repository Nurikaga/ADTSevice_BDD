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
    Then Verify ADT logo button is displayed

  @US-07
  Scenario: Verify drop down menu is present
    When I click on Home & Personal button
    And Verify the drop down menu should be visible

  @US-08
  Scenario Outline: Verify Home & Personal drop down menu text links are displayed & clickable
    When I click on Home & Personal button
    Then Verify "<links>" are displayed
    And Verify "<buttons>" are enable
    Examples:
      | links                  | buttons                |
      | Home & Personal        | Home & Personal        |
      | Small Business         | Small Business         |
      | Health & Senior Safety | Health & Senior Safety |
      | Commercial             | Commercial             |
      | Solar                  | Solar                  |

  @US-09
  Scenario Outline: Verify top menu text links are displayed & enable to click
    Then Verify "<links>" are displayed
    Then Verify "<buttons>" are enabled
    Then Verify "Shop Now" button is displayed
    And Verify "Shop Now" button is enabled
    Examples:
      | links          | buttons        |
      | Products       | Products       |
      | Packages       | Packages       |
      | Build Your own | Build Your own |
      | Deals          | Deals          |

  @US-12.1
  Scenario: Verify the phone number pops up
    When I click on "Call Button" hovered-over button
    Then Verify "(800) 510-9061" under icon is displayed

  @US-12
  Scenario: Verify the phone number pops up
    When I hover over call button
    Then Verify the texts under pictures are displayed

  @US-13
  Scenario: Verify the Customer Login page title
    When I click on Customer Login icon
    Then I verify the title of the page "ADT® Customer Login: Manage Your Active ADT Account"


  @US15
  Scenario:Verify the Get a free quote and ADT offers window appeared after clicking on the button
    When I click on Get a free quote button
    Then Verify the window is displayed


  @US14
  Scenario: Verify the shopping Cart page title is ‘Cart | ADT® Self Setup | DIY’
    When I click on Shopping cart icon
    Then Verify title is "Cart | ADT® Self Setup | DIY"

  @US-17
  Scenario: Verify the Small Business header
    When I click on Home & Personal button
    Then I click on Small Business button
    And Verify "Customize a business security system today " text in header is displayed

  @US-19
  Scenario: Verify the footer menu icons: FaceBook, Twitter, Pinterest, Unstagram, & Youtube
    When I scroll down
    Then Verify the "FaceBook" button is displayed
    Then Verify the "FaceBook" button is enabled
    And I click on "FaceBook" icon and change Window to the new tab
    Then Verify the title of the FaceBook page is "ADT | Facebook"
    Then Verify Twitter button "Twitter"  is displayed
    Then Verify Twitter "Twitter"  is enabled
    And I click on button "Twitter" icon and change Window to the new tab
    Then Verify the title of the Twitter page is "ADT (@ADT) / X"
    Then Verify Pinterest button "Pinterest"  is displayed
    Then Verify Pinterest "Pinterest"  is enabled
    And I click Pinterest button "Pinterest" icon and change Window to the new tab
    Then Verify the title of the Pinterest page is "ADT (adtstaysafe) - Profile | Pinterest"
    Then Verify Instagram button "Instagram"  is displayed
    Then Verify Instagram "Instagram"  is enabled
    And I click Instagram button "Instagram" icon and change Window to the new tab
    Then Verify the title of theInstagram page is "ADT (@adtsecurity) • Instagram photos and videos"
    Then Verify YouTube button "YouTube"  is displayed
    Then Verify YouTube "YouTube"  is enabled
    And I click YouTube button "YouTube" icon and change Window to the new tab
    Then Verify the title of YouTube page is "ADT - YouTube"







