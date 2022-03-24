package starter.page;

import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div[2]/div/div/div[1]/a/div/div/p")
    WebElement RegularCleaning;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/section/div[1]/div/div/div[2]/button/p")
    WebElement  bookService;
    @FindBy(how = How.XPATH, using = "//button[text()='Book This Services']")
    WebElement bookServiceOnPopUp;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/section/div/div/div/div[2]/div[3]/div[1]/select")
    WebElement paymentMethod;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/section/div/div/div/div[2]/div[3]/div[1]/select/option[2]")
    WebElement gopay;
    @FindBy(id = "phonenumber")
    WebElement inputPhoneNumber;
    @FindBy(id = "quantity")
    WebElement inputQuantity;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/section/div/div/div/div[2]/div[5]/div[1]/select")
    WebElement city;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/section/div/div/div/div[2]/div[5]/div[1]/select/option[5]")
    WebElement jakartaBarat;
    @FindBy(id = "pickupdate")
    WebElement pickUpDate;
    @FindBy(id = "Address")
    WebElement inputAddress;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/section/div/div/div/div[2]/div[7]/div[2]/button")
    WebElement confirmOrder;
    @FindBy(how = How.XPATH, using = "//button[text()='Yes']")
    WebElement confirmOrderOnPopUp;
    @FindBy(how = How.XPATH, using = "//button[text()='Ok']")
    WebElement okOrderSuccess;
    @FindBy(how = How.XPATH, using = "//p[text()='Payment Invoice']")
    WebElement paymentInvoice;


    public void serviceRegularCleaning() {
        Scroll.to(RegularCleaning);
        RegularCleaning.click();
        element(bookService).waitUntilVisible();
    }
    public void bookThisService() {
        bookService.click();
    }
    public void bookThisServiceOnPopup() {
        bookServiceOnPopUp.click();
        element(paymentMethod).waitUntilVisible();
    }
    public void selectPaymentMethod(){
        paymentMethod.click();
        gopay.click();
    }
    public void phoneNumber(String phoneNumber){
        inputPhoneNumber.sendKeys(phoneNumber);
    }
    public void quantity(String quantity){
        inputQuantity.sendKeys(quantity);
    }
    public void selectCity(){
        city.click();
        jakartaBarat.click();
    }
    public void selectPickUpDate(String date){
        pickUpDate.sendKeys(date);
    }
    public void address(String address){
        inputAddress.sendKeys(address);
    }
    public void clickConfirmOrder() {
        confirmOrder.click();
    }
    public void clickYesOnPopup() {
        confirmOrderOnPopUp.click();
        element(okOrderSuccess).waitUntilVisible();
    }
    public void clickOkOrderSuccess() {
        okOrderSuccess.click();
        element(paymentInvoice).waitUntilVisible();
    }
    public String verifyPaymentInvoice(){
        return paymentInvoice.getText();
    }

}