Feature: To validate the Flipkart Application

  Background:
    Given Launch the Flipkart Application
    When Close the popup
    Then It should navigate to the Home Page

  Scenario: To validate the Search functionality
    Given User enters the Text in the Search field
    When Click the Search button
    Then It should navigate to the search result page and display the relevant details