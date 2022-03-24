Feature: as a new user i can do SignUp

  @SignUp
  Scenario: Sign Up success
    Given I open Shoes Service Station Page
    When I click dropdown Account
    When I click wording Sign Up
    Then page direct to Sign Up Page
    When I input my "Alterra Academy"
    And I input valid "alterraacademy@gmail.com"
    And I input "QE#2"
    When I click Sign Up button
    When I click OK on Message alert success create account
    Then Direct to Login Page, i can do Login