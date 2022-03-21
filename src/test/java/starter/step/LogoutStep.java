package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.LoginPage;
import starter.page.Logout;
import starter.page.SignUpPage;

public class LogoutStep {

    LoginPage loginPage;
    SignUpPage signUpPage;
    Logout logout;

    @Step
    public void alreadyLogin(){
        loginPage.open();
        signUpPage.email("admin@gmail.com");
        signUpPage.password("admin123");
        loginPage.buttonLogin();
        loginPage.okOnAlertSuccessLogin();
        loginPage.verifySwiperWrapper();
    }
    @Step
    public void clickWordingLogout(){
        logout.wordingLogout();
    }
    @Step
    public void clickYesLogout(){
        logout.yesLogout();
    }
}
