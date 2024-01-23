#Author: sonia
Feature: Orange HRM login page

  Background: 
    Given admin is on login page

  Scenario: Login with correct credentials
    When admin enter correct username "Admin" and correct password "admin123"
    Then admin is directed to the home page that contains "Dashboard"

  Scenario: Login with wrong credentials
    When admin enter correct username "Admin" and wrong password "azerty"
    Then admin is still on login page that contains message "Invalid credentials"
