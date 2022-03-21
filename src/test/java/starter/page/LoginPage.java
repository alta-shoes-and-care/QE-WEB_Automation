package starter.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://shoes-service-station.netlify.app/login")
public class LoginPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div/div/h4")
    WebElement textLogin;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Login')]")
    WebElement wordLogin;
    @FindBy(how = How.XPATH, using= "//*[@id=\"__next\"]/main/div/div/div/div/div/form/div[3]/button")
    WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//button[text()='OK']")
    WebElement okLogin;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div[1]/div/div[4]")
    WebElement swiperWrapper;

    public String verifyLoginPage() {
        return textLogin.getText();
    }
    public void buttonLogin(){
        btnLogin.click();
        element(okLogin).waitUntilVisible();
    }
    public void okOnAlertSuccessLogin(){
        okLogin.click();
    }
    public Boolean verifySwiperWrapper(){
        return swiperWrapper.isDisplayed();
    }
}
