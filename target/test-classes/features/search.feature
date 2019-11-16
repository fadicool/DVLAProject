@Test-Done
Feature: user
  As a user of the website
  I want to be able to enter a vehicle registration number
  So I check the vehicles make and colour.

  Background:
    Given I am on DVLAs Vehicles Information Page
    And I proceed to check vehicles specific details

  Scenario Outline: The user enters a valid vehicle registration number
    When I enter vehicle registration number <valid-reg-number> in the searchBox
    And press the continue button
    Then the vehicles make <make> and colour <colour> should be displayed
    Examples:
      |valid-reg-number| make          | colour   |
      | KN09KTP        | MERCEDES-BENZ | SILVER   |


  Scenario Outline: The user enters an invalid vehicle registration number
    When I enter vehicle registration number <invalid-reg-number> in the searchBox
    And press the continue button
    Then an error <error-type> should be displayed
    Examples:
      |invalid-reg-number| error-type|
      | 1234567          |   page    |


  Scenario Outline: The user enters an invalid formatted vehicle registration number
    When I enter vehicle registration number <inv-form-reg> in the searchBox
    And press the continue button
    Then an error <error-type> should be displayed
    Examples:
      |inv-form-reg| error-type |
      | ABC1234    | message    |


  Scenario Outline: The user searches for a vehicle using external data <file-name>
    And I get external test data <file-name>
    When I enter a vehicles registration number in the searchBox
    And press the continue button
    Then I should be taken to the relevant page
    Examples:
      | file-name |
      | file1.csv |
      | file2.csv |
      | file3.csv |



