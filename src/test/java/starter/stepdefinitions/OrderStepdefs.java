package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.OrderStep;

public class OrderStepdefs {
    @Steps
    OrderStep orderStep;

    @When("I select Service type Regular Cleaning")
    public void selectServiceRegularCleaning() {
        orderStep.selectServiceRegularCleaning();
    }

    @When("I click Book this Service")
    public void clickBookThisService() {
        orderStep.clickBookThisService();
    }

    @When("I click Book this Service on popup confirm order")
    public void clickBookThisServiceOnPopupConfirmOrder() {
        orderStep.clickBookThisServiceOnPopup();
    }

    @When("I select payment method Gopay")
    public void selectPaymentMethodGopay() {
        orderStep.selectPaymentMethodGopay();
    }

    @And("I input Phone Number {string}")
    public void inputPhoneNumber(String phoneNumber) {
        orderStep.inputPhoneNumber(phoneNumber);
    }

    @And("I input Quantity {string}")
    public void inputQuantity(String quantity) {
        orderStep.inputQuantity(quantity);
    }

    @And("I select City is Jakarta Barat")
    public void selectCityIsJakartaBarat() {
        orderStep.selectCityIsJakartaBarat();
    }

    @And("I input PickUp Date is {string}")
    public void inputPickUpDate(String date) {
        orderStep.inputPickUpDate(date);
    }

    @And("I input Address is {string}")
    public void inputAddress(String address) {
        orderStep.inputAddress(address);
    }

    @When("I click Confirm Order")
    public void clickConfirmOrder() {
        orderStep.clickConfirmOrder();
    }

    @When("I click Yes on popup")
    public void clickYesOnPopup() {
        orderStep.clickYesOnPopup();
    }

    @When("I click Ok Order Success")
    public void clickOkOrderSuccess() {
        orderStep.clickOkOrderSuccess();
    }

    @Then("Invoice is display")
    public void invoiceIsDisplay() {
        orderStep.verifyPaymentInvoice();
    }
}
