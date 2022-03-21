package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.step.LogoutStep;

public class LogoutStepdefs {
    @Steps
    LogoutStep logoutStep;

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
}
