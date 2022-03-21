Feature: as an user and admin, we can do logout

  @Logout
  Scenario: Logout success
    Given I already login
    When I on Landing Page
    And I click dropdown Account
    And I click wording Logout
    And I click Yes want to logout
    Then I on Landing Page
