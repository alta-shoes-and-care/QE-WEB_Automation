Feature: as a user can do login

  @Login
  Scenario: Login success
    Given I already on Login Page
    When I input valid "user@gmail.com"
    And I input "user123"
    When I click Login Button
    When I click OK on Message alert success login
    Then I on Landing Page User

