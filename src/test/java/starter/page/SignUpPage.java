package starter.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://shoes-service-station.netlify.app/")
public class SignUpPage extends PageObject {
    @FindBy(id="menu-button")
    WebElement dropdownAccount;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Sign up')]")
    WebElement wordSignUp;
    @FindBy(how = How.XPATH,using = "//*[@id=\"__next\"]/main/div/div/div/div/h4")
    WebElement textSignUp;
    @FindBy(id = "name-user")
    WebElement inputName;
    @FindBy(id = "email-address")
    WebElement inputEmail;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(how = How.XPATH, using= "//*[@id=\"__next\"]/main/div/div/div/div/form/div[4]/button")
    WebElement btnSignUp;
    @FindBy(how = How.XPATH, using = "//button[text()='OK']")
    WebElement okSignUp;


    public void dropdownAccount(){
        dropdownAccount.click();
    }
    public void wordingSignUp(){
        wordSignUp.click();
    }
    public String verifySignUpPage() {
        return textSignUp.getText();
    }
    public void name(String name){
        inputName.sendKeys(name);
    }
    public void email(String email){
        inputEmail.sendKeys(email);
    }
    public void password(String password){
        inputPassword.sendKeys(password);
    }
    public void buttonSignUp(){
        btnSignUp.click();
        element(okSignUp).waitUntilVisible();
    }
    public void okOnAlertSuccessSignUp(){
        okSignUp.click();
    }
}
