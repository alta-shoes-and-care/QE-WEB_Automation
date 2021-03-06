package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStep {
    LoginPage loginPage;

    @Step
    public void alreadyOnLoginPage(){
        loginPage.open();
    }
    @Step
    public void clickButtonLogin(){
        loginPage.buttonLogin();
    }
    @Step
    public void clickOkOnAlertSuccessLogin(){
        loginPage.okOnAlertSuccessLogin();
    }
    @Step
    public void verifyOnLandingPageUser(){
        assertTrue(loginPage.verifySwiperWrapper());
        assertEquals("My Order", loginPage.myOrderMenu());
    }

}
