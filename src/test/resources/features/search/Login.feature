Feature: as an user and admin, we can do login

  @Login
  Scenario Outline: Login success
    Given I already on Login Page
    When I input valid "<Email>"
    And I input "<Password>"
    When I click Login Button
    When I click OK on Message alert success login
    Then I on Landing Page

    Examples:
      | Email           | Password |
      | admin@gmail.com | admin123 |