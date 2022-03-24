package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.LandingStep;
import starter.step.LogoutStep;

public class LogoutStepdefs {
    @Steps
    LogoutStep logoutStep;
    LandingStep landingStep;

    @Given("I already login")
    public void alreadyLogin() {
        logoutStep.alreadyLogin();
    }
    @And("I click wording Logout")
    public void iClickWordingLogout() {
        logoutStep.clickWordingLogout();
    }
    @And("I click Yes want to logout")
    public void iClickYesWantToLogout() {
        logoutStep.clickYesLogout();
    }

    @When("I click OK on Message alert success logout")
    public void clickOKOnMessageAlertSuccessLogout() {
        logoutStep.clickOkSuccessLogout();
    }

    @Then("I on Landing Page")
    public void onLandingPage() {
        landingStep.verifyLandingPage();
    }

}
