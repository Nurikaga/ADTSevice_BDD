@healthSenioreScenarios @regression
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage
    When I click  "Home & Personal" button
    And I click on "Health & Senior Safety" button

  @US21
  Scenario: Click on the Home & Personal drop-down button on the Home page. Click on the Health & Senior option button that takes you to the Health & Senior page and verify the title of the page.
    Then Verify title of the Health & Senior Safety is "Medical Alert Systems | Health & Senior Safety Resources by ADT"

  @US-22
  Scenario Outline: Verify the page Health & Senior Safety Page top menu text links are displayed
    Then I change Window to the new tab
    And Verify "<links>" are displayed
    Examples:
      | links            |
      | Products         |
      | Compare Packages |
      | Why ADT          |
      | FAQS             |
      | Testimonials     |

  @US23
  Scenario: Verify there is a SPECIAL MEDICAL ALERT OFFER on the left side of the Health & Senior Safety page and a SHOP NOW button with the small text under a CLICK HERE button. Verify the buttons are clickable
    Then Verify "SPECIAL MEDICAL ALERT OFFER" is displayed
    Then Verify "Plus" is displayed
    Then Verify " get free 2-day shipping and activation" is displayed
    Then Verify "Use" is displayed
    Then Verify "promo code" is displayed
    Then Verify ": SAFETY" is displayed
    Then Verify SHOP NOW button is enabled
    Then Verify "*Requires a month-to-month agreement. Excludes taxes. First month monitoring due at time of purchase. Limited to one discounted Fall Detection pendant only. For additional details, " is displayed
#    When I scroll up
    And I click "Click here." button
    Then Verify title is "ADT Terms & Conditions for Medical Alert Systems by ADT"


  @US-22
  Scenario Outline: Verify the page Health & Senior Safety Page top menu text links are displayed
    And Verify "<links>" are displayed
    Examples:
      | links            |
      | Products         |
      | Compare Packages |
      | Why ADT          |
      | FAQS             |
      | Testimonials     |

  @US25
  Scenario: Verify Picture under the main menu Health & Senior Safety Page
    Then I verify the picture is displayed

  @US24 @smoke
  Scenario: Verify the phone symbol is hovered over and the phone number is displayed. Verify the  Customer symbol button is clickable and forward to the following page. Verify the current URL of the Customers page.
    And I hover over phone symbol button
    Then Verify "(800) 588-0023" is displayed
    When I click customer symbol button
    Then Verify the url is "https://www.adt.com/customer/login"

  @US26
  Scenario Outline: Verify the Health & Senior Page has header and texts, descriptions under are displayed
    Then Verify "Have no worries with medical alert systems for every lifestyle " text in header is displayed
    Then Verify "Get protection while you’re at home, or wherever you go. Add features to your medical alert system like Fall Detection*, which can get you help even if you can’t push the button. " text under header is displayed
    Then Verify pictures are displayed under header above
    Then Verify text under name is displayed
    Then Verify "<description>" is displayed
    Then Verify "<description>" is displayed
    Then Verify "<textUnderDesk1>" is displayed
    Then Verify "<textUnderDesk2>" is displayed
    Then Verify "<textUnderDesk3>" is displayed
    Then Verify "<textUnderDesk4>" is displayed
    Then Verify "<textUnderDesk5>" is displayed
    Then Verify "<textUnderDesk6>" is displayed
    Then Verify "<textUnderDesk7>" is displayed
    Then Verify Online special buttons are displayed
    Then Verify "<textUnderDesk8>" is displayed
    Then Verify "<textUnderDesk9>" is displayed
    Then Verify "<textUnderDesk10>" is displayed
    Then Verify "<shopNowButton>" is displayed
    Examples:
      | description                                                                                           | textUnderDesk1     | textUnderDesk2       | textUnderDesk3              | textUnderDesk4              | textUnderDesk5            | textUnderDesk6 | textUnderDesk8                        | textUnderDesk9  | textUnderDesk10 | shopNowButton |
      | Provides freedom and peace of mind while at home or miles from it.                                    | Mobile base unit   | No landline required | Fall Detection (optional)   | GPS location capabilities   | Pendant options available | $39.99/month   | Get 50% off Fall Detection monitoring | Use promo code: | SAFETY          | Shop now      |
      | Extended in-home range grants independence to those who love to garden or relax in the yard.          | In-home operations | No landline required | Fall Detection (optional)   | Home temperature monitoring | Pendant options available | $37.99/month   | Get 50% off Fall Detection monitoring | Use promo code: | SAFETY          | Shop now      |
      | Gives you or your loved ones the confidence needed to live alone and maintain independence when home. | In-home operations | Landline required    | Home temperature monitoring |                             |                           | $29.99/month   |                                       |                 |                 | Shop now      |

  @US27
  Scenario: verify the buttons take to the following pages by checking their titles
    Then Verify "Have no worries with medical alert systems for every lifestyle " text in header is displayed
    And I click on Shop Now button and Verify titles of the pages

  @US29
  Scenario: Verify a header and a video is displayed and able to play
    And I verify the header "See how ADT Medical Alert Systems work" in the page
    Then I verify the video is displayed
    And I verify the video is able to play

  @US28
  Scenario Outline: There should be a section with the header “Add even more wellbeing to your ADT Medical Alert System” and the equipment options with pictures, names, and descriptions. Verify the pictures, names, and descriptions are displayed
    Then Verify "Add even more wellbeing to your ADT Medical Alert System " text in header is displayed
    Then Verify images are displayed
    Then Verify "<imageText>" is displayed
    Then Verify "<imageTextDescription>" is displayed
    Then Verify "<smallText>" is displayed
    Examples:
      | imageText                    | imageTextDescription                                                                                                                                                                                                                           | smallText                                              |
      | Fall Detection pendant*      | ADT can automatically be alerted after a fall even if you can’t press the button on the Fall Detection pendant yourself. Available with Medical Alert Plus and On-the-Go systems.                                                              | *Fall Detection pendant does not detect 100% of falls. |
      | Lockbox                      | If there’s an emergency, keeping a spare key in an ADT Lockbox can give friends, family or first responders a quick and easy way into the house without the need for forced entry.                                                             |                                                        |
      | Waterproof Wall-Mount Button | With our emergency button in a set location, you know exactly where to go to press for help in an emergency. Easily mounts to the wall or can be placed on a table or nightstand. Available with the Medical Alert Plus and On-the-Go systems. |                                                        |

  @US30
  Scenario: It should be section “Fast, reliable 24/7 help in an emergency”.  Verify a header, text, and three buttons are displayed and clickable.
    Then Verify "Fast, reliable 24/7 help in an emergency " text in header is displayed
    Then Verify "When you need help quickly, ADT is there for you. We've got you covered with fast, reliable help in an emergency, so you can live with no worries. " text under the header is displayed
    Then Verify three buttons are displayed
    Then Verify three buttons are enabled


