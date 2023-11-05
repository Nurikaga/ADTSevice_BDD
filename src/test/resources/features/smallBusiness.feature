@smallBusinessScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page

  @US01 @smoke
  Scenario:Verify title of the Small Business page
    Then I verify the title of the page "Business Security Systems & Services | ADT®"

  @US02
  Scenario Outline: Verify Solutions, Industries, Products, Packages, Risk Assessment, and Resources buttons in the header are displayed, & enable to click
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
    Then I navigate to "Solutions" drop down menu
    And I click on "Intrusion Detection" link button that takes to the Intrusion Detection page
    Then I change Window to the new tab
    And I verify the header "Professionally-monitored intrusion detection" in the page

  @US04
  Scenario Outline: Verify a header and the links are displayed on Interactive Security page
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
    Then I navigate to Accessibility button in the footer and click it
    Then Verify pop-up window with Accessibility menu buttons is display on the right top of the page

  @US20
  Scenario: Verify header text and text under is displayed. 6 pictures with texts an Learn more buttons are displayed
    Then Verify "Customize a business security system today " text in header is displayed
    Then Verify "Your business isn’t just your business. It’s your passion, your way of life. It’s also a livelihood for you and your employees. We can tailor a security solution to help protect it. " text under header is displayed
    Then Verify pictures are displayed
    Then Verify the texts under pictures are displayed
    Then Verify Learn more buttons are displayed

  @US31
  Scenario: Verify the header We’ll Call You and the following text Fill out this form and an ADT specialist will contact you to discuss ADT security solutions. is displayed. Fill out input fields
    When I click "Home & Personal" hovered-over button
    Then I click on "Small Business" link button that forwarding to the Small Business page

  @US32
  Scenario Outline: verify the links headers stay the same on the corresponding pages
    When user clicks on "<linkHeader>" link's header button
    Then verify the linkHeader is "<header>"
    Examples:
      | linkHeader               | header                |
      | Professional Services    | Professional Services |
      | Food & Beverage          | Food & Beverage       |
      | Retail                   | Retail                |
      | Automotive Repairs       | Automotive            |
      | Manufacturing/Warehouses | Manufacturing         |
      | Health & Wellness        | Health & Wellness     |

  @US-33
  Scenario Outline: Verify the footer Product Categories menu
    When I scroll down
    Then Verify "<link>" link buttons are enabled
    Then Verify "<title>" of each page
    Examples:
      | link                   | title                                                             |
      | Home Security          | Best Home Security Systems by ADT® \| Home Security You Can Trust |
      | Smart Home Automation  | Smart Home Automation Systems \| ADT®                             |
      | Security Cameras       | Home Security Cameras & Wireless Camera Systems \| ADT®           |
      | Business Security      | Business Security Systems & Services \| ADT®                      |
      | Commercial             | Everon Security & Fire Monitoring                                 |
      | Health & Senior Safety | Medical Alert Systems \| Health & Senior Safety Resources by ADT  |
      | Mobile Apps            | ADT® Apps \| Home Security Apps \| Smart Home Control by ADT      |

  @US35
  Scenario: Verify the footer Dealers & Service menu
    When I scroll down
    Then I click Local Service Areas button and change Window to the new tab
    Then I verify title of the Local Service Areas page is "ADT Local Service Areas"
    And I take screenshot of test
    And I click on Become an ADT Dealer button and Window to the new tab
    Then Verify title of the Become an ADT Dealer page is "Official ADT Authorized Dealer Program"
    And I take screenshot of test
    And I click on Dealer Lookup button and Window to the new tab
    Then Verify title of the Dealer Lookup page is "ADT Dealer License Lookup"
    And I take screenshot of test

    @US39
    Scenario: Verify the text "Personal Information Uses, Disclosures, and Sharing" after clicking on footer privacy policy link
      When I scroll down
      Then I click on "Privacy Policy" text link
      Then I change Window to the new tab
      And Verify the text "Personal Information Uses, Disclosures, and Sharing" is displayed




