@homeScenarios @regression
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US-01 @smoke
  Scenario: Verify the Title of the page
    Then Verify Title of Home page is "ADT® Home Alarm Systems | #1 Smart Alarm Systems Provider"

  @US-05 @smoke
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

  @US-09 @smoke
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

  @US-12
  Scenario: Verify the phone number pops up
    When I hover over call button
    And Verify phone number under icon is "(800) 510-9061"

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
    And I take screenshot of test
    Then Verify Twitter button "Twitter"  is displayed
    Then Verify Twitter "Twitter"  is enabled
    And I click on button "Twitter" icon and change Window to the new tab
    Then Verify the title of the Twitter page is "ADT (@ADT) / X"
    And I take screenshot of test
    Then Verify Pinterest button "Pinterest"  is displayed
    Then Verify Pinterest "Pinterest"  is enabled
    And I click Pinterest button "Pinterest" icon and change Window to the new tab
    Then Verify the title of the Pinterest page is "ADT (adtstaysafe) - Profile | Pinterest"
    And I take screenshot of test
    Then Verify Instagram button "Instagram"  is displayed
    Then Verify Instagram "Instagram"  is enabled
    And I click Instagram button "Instagram" icon and change Window to the new tab
    Then Verify the title of theInstagram page is "ADT (@adtsecurity) • Instagram photos and videos"
    And I take screenshot of test
    Then Verify YouTube button "YouTube"  is displayed
    Then Verify YouTube "YouTube"  is enabled
    And I click YouTube button "YouTube" icon and change Window to the new tab
    Then Verify the title of YouTube page is "ADT - YouTube"

@US56
Scenario: When you open a Home Page and scroll down half of the page, you will see ‘Not sure where to start?’ text. Verify the text is present, verify the Take A Quiz button is present and clickable, and verify the title of the page after you click on Take A Quiz button
 When I scroll down
 Then Verify Not sure where to start? question is displayed when you scroll down towards the middle
 Then Verify that the "Take a quiz" button is displayed
  When I scroll up little
  When I click on Take a quiz button
  Then Verify title is "Quiz"

  @US001
  Scenario: Verify the Phone is clickable o
    When I click on Phone number
    Then Verify the popUp window is displayed and close the popUp window





  @US60
  Scenario: When you open a Home Page and scroll down 3/4 of the page, you will see ‘Get in touch with America’s #1 smart home security provider’ section. Verify the title of the section, the phone number is present,  correct (800) 510 - 9061, and clickable. Verify the section has a picture on the left
#When I scroll down
    Then Verify header text is Get in touch with America’s #1 smart home security provider
    Then Verify text under header is "An ADT security expert can help you customize the perfect solution."
    Then Verify phone number button is displayed
    When I click on phone number button
    Then Handle the alert press cancel


