Feature: Software Encryptor
  I don’t want to use encrypt and descript
  As a math lover
  I want to create yet another software Encryptor
  Scenario:
    Given I have my software encrypt
    When I have entered SYMBOL as first operand
    And I press 'Get encrypt'
    Then The result should be 110
	
  Scenario:
    Given I have my software encrypt
    When I have entered A as first operand
    And I press 'Get encrypt'
    Then The result should be 100

  Scenario:
    Given I have my software encrypt
    When I have entered B as first operand
    And I press 'Get encrypt'
    Then The result should be 101

  Scenario:
    Given I have my software encrypt
    When I have entered C as first operand
    And I press 'Get encrypt'
    Then The result should be 110

  Scenario:
    Given I have my software encrypt
    When I have entered D as first operand
    And I press 'Get encrypt'
    Then The result should be 111

  Scenario:
    Given I have my software encrypt
    When I have entered E as first operand
    And I press 'Get encrypt'
    Then The result should be 1000

  Scenario:
    Given I have my software encrypt
    When I have entered G as first operand
    And I press 'Get encrypt'
    Then The result should be 1010

  Scenario:
    Given I have my software encrypt
    When I have entered J as first operand
    And I press 'Get encrypt'
    Then The result should be 1011

  Scenario:
    Given I have my software encrypt
    When I have entered T as first operand
    And I press 'Get encrypt'
    Then The result should be 1100

  Scenario:
    Given I have my software encrypt
    When I have entered T as first operand
    And I have entered 111 as second operand
    And I press 'Encrypt from key'
    Then The result should be 1010100

  Scenario:
    Given I have my software encrypt
    When I have entered A as first operand
    And I have entered 1101100 as second operand
    And I press 'Encrypt from key'
    Then The result should be 110110000

  Scenario:
    Given I have my software encrypt
    When I have entered B as first operand
    And I have entered 100 as second operand
    And I press 'Encrypt from key'
    Then The result should be 10100

  Scenario:
    Given I have my software descrupt
    When I have entered A as first operand
    And I press 'Get descrypt'
    Then The result should be 4

  Scenario:
    Given I have my software descrupt
    When I have entered B as first operand
    And I press 'Get descrypt'
    Then The result should be 5

  Scenario:
    Given I have my software descrupt
    When I have entered C as first operand
    And I press 'Get descrypt'
    Then The result should be 6

  Scenario:
    Given I have my software descrupt
    When I have entered D as first operand
    And I press 'Get descrypt'
    Then The result should be 7

  Scenario:
    Given I have my software descrupt
    When I have entered E as first operand
    And I press 'Get descrypt'
    Then The result should be 9

  Scenario:
    Given I have my software descrupt
    When I have entered G as first operand
    And I press 'Get descrypt'
    Then The result should be 10