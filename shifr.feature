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


