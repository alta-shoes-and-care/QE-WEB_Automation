Feature: as a user, can do order service

  @Order
  Scenario: Order Service success
    Given I already login
    When I on Landing Page User
    When I select Service type Regular Cleaning
    When I click Book this Service
    When I click Book this Service on popup confirm order
    When I select payment method Gopay
    And I input Phone Number "08123456789"
    And I input Quantity "2"
    And I select City is Jakarta Barat
    And I input PickUp Date is "03-26-2022"
    And I input Address is "Kebon Jeruk"
    When I click Confirm Order
    When I click Yes on popup
    When I click Ok Order Success
    Then Invoice is display
