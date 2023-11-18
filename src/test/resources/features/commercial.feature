@CommercialScenarios @regression
Feature: Commercial Scenarios

  Background: Navigate to page
    Given I open url of homepage
    When I click "Home & Personal" hovered-over button
    Then I click on "Commercial" link button that forwarding to the Commercial page

  @US75
  Scenario:Verify nineteen icons are present
    Given I open url of Commercial page
    Then I verify that nineteen icons are present

  @US74
  Scenario: Verify title of the Commercial page
    Then I verify title of the page "Everon Security & Fire Monitoring"

  @US76
  Scenario Outline: Confirm that in the middle of the Commercial page these 19 icons are redirecting users to corresponding pages. Ex: Access control icon supposed to send you to the Access control page.
    When I click on "<icons>"
    Then Verify "<title>" of the responding page
    Examples:
      | icons                                                | title                                                          |
      | Access control                                       | Access Control Security Solutions \| Everon                    |
      | ATM/ITM solutions                                    | ATM & ITM Security Solutions \| Everon                         |
      | Electronic Article Surveillance                      | Electronic Article Surveillance (EAS) Systems \| Everon        |
      | Elevated Skin Temperature systems                    | Elevated Skin Temperature System \| Everon                     |
      | Emergency Responder Communication Enhancement System | Emergency Responder Communication Enhancement System \| Everon |
      | Enterprise Solutions                                 | Security Solutions for Large Enterprise \| Everon              |
      | eSuite                                               | eSuite Security Account Management \| Everon                   |
      | Everon Customer Engagement Platform                  | Everon Account Engagement \| Everon                            |
      | EvoGuard Guarding Solutions                          | EvoGuard™️ Guarding Solutions \| Everon                        |
      | Fire & life safety                                   | Fire & Life Safety Solutions \| Everon                         |
      | Infrastructure as a Service                          | Security Infrastructure as a Service \| Everon                 |
      | Installation, inspections & maintenance              | Installation, Inspections & Security Maintenance \| Everon     |
      | Integrated solutions                                 | Integrated Security Solutions \| Everon                        |
      | Intrusion                                            | Intrusion Security Solutions \| Everon                         |
      | Managed services                                     | Managed Security Services \| Everon                            |
      | Monitoring                                           | Security Monitoring \| Everon                                  |
      | Occupancy management                                 | Occupancy Management \| Everon                                 |
      | Structured Cabling                                   | Structured Cabling \| Everon                                   |
      | Video                                                | Video Security Solutions \| Everon                             |

  @US77
  Scenario: Check if the "Our Advantage" button is present and clickable
    When I navigate to the "Powered by Experinece section"
    Then I should see a button labeled "Our Advantage"
    And I should be able to click on the "Our Advantage" button
    Then I verify a title of the page "Our Advantage | Everon"

  @US81
  Scenario: Verify Copyright text is displayed in the footer of Commercial Page
    When I scroll down to the footer of the page
    Then I verify that text is displayed page

  @US82
  Scenario Outline: Verify there are 5 hyperlinks under the Copyright text
    When I scroll down to the footer of the page
    Then verify text is displayed
    And verify Terms drop down button is enabled
    Then Verify the "<links>" link buttons are displayed and enabled

    Examples:
      | links           |
      | Terms          |
      | Privacy Policy |
      | Licenses       |
      | Sitemap        |
      | Bug Reporting  |