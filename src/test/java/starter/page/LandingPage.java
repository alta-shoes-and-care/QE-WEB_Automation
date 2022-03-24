package starter.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://shoes-service-station.netlify.app/")
public class LandingPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/a/div/span/img")
    WebElement logo;
    @FindBy(how = How.XPATH,using = "//*[contains(a(),'Find Us')]")
    WebElement findUs;
    @FindBy(how = How.XPATH,using = "//*[contains(a(),'About Us')]")
    WebElement aboutUs;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Account')]")
    WebElement account;
    @FindBy(how = How.XPATH,using = "//*[@id=\"__next\"]/main/div/div[1]/div")
    WebElement swiper;


    public Boolean logoIsDisplay(){
        element(logo).waitUntilVisible();
        return logo.isDisplayed();
    }
    public String findUsDisplay(){
        return findUs.getText();
    }
    public String aboutUsDisplay(){
        return aboutUs.getText();
    }
    public String accountDisplay(){
        return account.getText();
    }
    public Boolean verifySwiperWrapper(){
        return swiper.isDisplayed();
    }
}
