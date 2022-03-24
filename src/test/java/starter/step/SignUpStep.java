package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.LoginPage;
import starter.page.SignUpPage;
import static org.junit.Assert.assertEquals;

public class SignUpStep {
    SignUpPage signUpPage;
    LoginPage loginPage;

    @Step
    public void openShoesServiceStation(){
        signUpPage.open();
    }
    @Step
    public void clickDropdownAccount(){
        signUpPage.dropdownAccount();
    }
    @Step
    public void clickWordingSignUp(){
        signUpPage.wordingSignUp();
    }
    @Step
    public void verifySignUpPage(){
        assertEquals("Create new account by filling the form below.",signUpPage.verifySignUpPage());
    }
    @Step
    public void inputName(String name){
        signUpPage.name(name);
    }
    @Step
    public void inputEmail(String email){
        signUpPage.email(email);
    }
    @Step
    public void inputPassword(String password){
        signUpPage.password(password);
    }
    @Step
    public void clickButtonSignUp(){
        signUpPage.buttonSignUp();
    }
    @Step
    public void clickOkOnAlertSuccessSignUp(){
        signUpPage.okOnAlertSuccessSignUp();
    }
    @Step
    public void verifyLoginPage(){
        assertEquals("Login to your account.",loginPage.verifyLoginPage());
    }
}

