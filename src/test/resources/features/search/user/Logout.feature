Feature: as a user can do logout

  @Logout
  Scenario: User successfully Logout
    Given I already login
    When I click dropdown Account
    When I click wording Logout
    When I click Yes want to logout
    When I click OK on Message alert success logout
    Then I on Landing Page
