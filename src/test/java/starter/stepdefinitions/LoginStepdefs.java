package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.LoginStep;

public class LoginStepdefs {
    @Steps
    LoginStep loginStep;

    @Given("I already on Login Page")
    public void alreadyOnLoginPage() {
        loginStep.alreadyOnLoginPage();
    }

    @When("I click Login Button")
    public void clickLoginButton() {
        loginStep.clickButtonLogin();
    }

    @When("I click OK on Message alert success login")
    public void clickOkOnAlertSuccessLogin() {
        loginStep.clickOkOnAlertSuccessLogin();
    }

    @Then("I on Landing Page")
    public void seeAllOnLandingPage() {
        loginStep.verifySwiperWrapper();
    }
}
