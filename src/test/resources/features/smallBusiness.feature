@smallBusinessScenarios @regression
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
    When I scroll down until i see We'll Call You test
    Then Verify the "We'll Call You" text under header is displayed
    Then Verify "Fill out this form and an ADT specialist will contact you to discuss ADT security solutions." text under We'll Call You is displayed
    When I fill out the form
      | Key                  | Value            |
      | Customer_Full_Name   | Patric           |
      | Business_Name        | TOOSu            |
      | E_Mail_Address       | patric@gmail.com |
      | Phone_Number_Primary | 3355335544       |
      | Postal_Code          | 53533            |
   # When I choose values from dropdowns
     # | key          | value                |
     # | Industry     | Retail               |
     # | Company Size | 1,000 - 5,000 sq. ft |

    And I click on the Call Me Back button
    Then Verify Customize a Security Solution for Your Business  header text is visible

    @US31a
    Scenario: Verify the header We’ll Call You and the following text Fill out this form and an ADT specialist will contact you to discuss ADT security solutions. is displayed. Fill out input fields
      When I scroll down until i see We'll Call You test
      Then Verify the "We'll Call You" text under header is displayed
      Then Verify "Fill out this form and an ADT specialist will contact you to discuss ADT security solutions." text under We'll Call You is displayed
      And I verify the select box is clickable and has the options
      When the user fills out the form with data
      And I click on the Call Me Back button
      Then Verify Customize a Security Solution for Your Business  header text is visible




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

  @US34
  Scenario Outline: Verify links under About Section
    When I scroll down
    Then Verify "<link>" link buttons are enabled
    And I change Window to the new tab
    Then Verify "<title>" of each page
    Then I take screenshot of test
    Examples:
      | link               | title                                                          |
      | About Us           | About ADT Company History \| What is & Who Owns ADT            |
      | ADT Reviews        | Why ADT has the Best Home Security and Customer Service \| ADT |
      | Newsroom           | ADT - Newsroom & Stories                                       |
      | Careers            | Working at ADT \| Jobs and Careers at ADT                      |
      | Investor Relations | ADT Inc. - Investor Relations                                  |

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

  @US37
  Scenario Outline: Verify the footer text and links buttons
    When I scroll down
    Then verify text is displayed
    And verify Terms drop down button is enabled
    Then Verify "<link>" link buttons are displayed and enabled
    Examples:
      | link           |
      | Privacy Policy |
      | En Español     |
      | Licenses       |
      | Sitemap        |

  @US38
  Scenario Outline: Verify the footer Terms button choice is enabled
    When I scroll down
    Then I click on Terms drop down button
    Then Verify "<link>" link buttons are clicked
    And I change Window to the new tab
    Then Verify "<title>" of each page
    Examples:
      | link               | title                                                      |
      | Terms of Use       | ADT Security Websites Terms of Use - ADT Security Services |
      | Advertising Choice | TrustArc Preference Manager                                |


  @US39
  Scenario: Verify the text "Personal Information Uses, Disclosures, and Sharing" after clicking on footer privacy policy link
    When I scroll down
    Then I click on "Privacy Policy" text link
    Then I change Window to the new tab
    And Verify the text "Personal Information Uses, Disclosures, and Sharing" is displayed

  @US40
  Scenario: Verify  En Espanol button
    When I scroll down
    Then I click on En Espanol button
    Then I change Window to the new tab
    And Verify the text "¿Qué es ADT?" is displayed on corresponding page