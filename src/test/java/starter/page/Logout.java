package starter.page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logout extends PageObject {
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Logout')]")
    WebElement wordLogout;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Logout')]")
    WebElement yLogout;

    public void wordingLogout(){
        wordLogout.click();
    }
    public void yesLogout(){
        yLogout.click();
    }
}
