package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.SignUpStep;

public class SignUpStepdefs {
    @Steps
    SignUpStep signUpStep;

    @Given("I open Shoes Service Station Page")
    public void openShoesServiceStationPage() {
        signUpStep.openShoesServiceStation();
    }

    @When("I click dropdown Account")
    public void clickDropdownAccount() {
        signUpStep.clickDropdownAccount();
    }

    @When("I click wording Sign Up")
    public void clickWordingSignUp() {
        signUpStep.clickWordingSignUp();
    }

    @Then("page direct to Sign Up Page")
    public void directToSignUpPage() {
        signUpStep.verifySignUpPage();
    }

    @When("I input my {string}")
    public void inputName(String name) {
        signUpStep.inputName(name);
    }

    @And("I input valid {string}")
    public void inputEmail(String email) {
        signUpStep.inputEmail(email);
    }

    @And("I input {string}")
    public void inputPassword(String password) {
        signUpStep.inputPassword(password);
    }

    @When("I click Sign Up button")
    public void clickSignUpButton() {
        signUpStep.clickButtonSignUp();
    }

    @When("I click OK on Message alert success create account")
    public void clickOkOnAlertSuccessSignUp() {
        signUpStep.clickOkOnAlertSuccessSignUp();
    }

    @Then("Direct to Login Page, i can do Login")
    public void directToLoginPage() {
        signUpStep.verifyLoginPage();
    }
}