Feature: as an new user i can do SignUp

  @SignUp
  Scenario Outline: Sign Up success
    Given I open Shoes Service Station Page
    When I click dropdown Account
    When I click wording Sign Up
    Then page direct to Sign Up Page
    When I input my "<Name>"
    And I input valid "<Email>"
    And I input "<Password>"
    When I click Sign Up button
    When I click OK on Message alert success create account
    Then Direct to Login Page, i can do Login

    Examples:
      | Name    | Email            | Password |
      | tas tas | tastas@gmail.com | tas123   |


#  @SignUpFailed
#  Scenario Outline: Sign Up Failed
#    Given I open Shoes Service Station Page
#    When I click dropdown Account
#    When I click wording Sign Up
#    Then page direct to Sign Up Page
#    When I input my "<Name>"
#    And I input valid "<Email>"
#    And I input "<Password>"
#    When I click Sign Up button
#    When I click OK on Message alert success create account
#    Then Direct to Login Page, i can do Login
#
#    Examples:
#      | Name     | Email             | Password |
#      | tas tess | tastess@gmail.com | test123  |
