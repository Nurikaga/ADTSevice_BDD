@healthSenioreScenarios
Feature: Home Page Related Scenarios

  Background: Navigate to page
    Given I open url of homepage

  @US23
  Scenario: Verify there is a SPECIAL MEDICAL ALERT OFFER on the left side of the Health & Senior Safety page and a SHOP NOW button with the small text under a CLICK HERE button. Verify the buttons are clickable
    When I click on Home & Personal button
    And  I click on "Health & Senior Safety" button
    Then Verify "SPECIAL MEDICAL ALERT OFFER" is displayed
    Then Verify "Plus" is displayed
    Then Verify " get free 2-day shipping and activation" is displayed
    Then Verify "Use" is displayed
    Then Verify "promo code" is displayed
    Then Verify ": SAFETY" is displayed
    Then Verify SHOP NOW button is enabled
    Then Verify "*Requires a month-to-month agreement. Excludes taxes. First month monitoring due at time of purchase. Limited to one discounted Fall Detection pendant only. For additional details, " is displayed
    When I scroll up
    And I click "Click here." button
    Then Verify title is "ADT Terms & Conditions for Medical Alert Systems by ADT"


  @US-22
  Scenario Outline: Verify the page Health & Senior Safety Page top menu text links are displayed
    When I click  "Home & Personal" button
    Then I click on "Health & Senior Safety" button
    Then I change Window to the new tab
    And Verify "<links>" are displayed
    Examples:
      | links            |
      | Products         |
      | Compare Packages |
      | Why ADT          |
      | FAQS             |
      | Testimonials     |


  @US26
  Scenario Outline: Verify the Health & Senior Page has header and texts, descriptions under are displayed
    When I click on Home & Personal button
    And  I click on "Health & Senior Safety" button
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

