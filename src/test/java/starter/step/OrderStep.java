package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.OrderPage;
import static org.junit.Assert.*;

public class OrderStep {
    OrderPage orderPage;

    @Step
    public void selectServiceRegularCleaning(){
        orderPage.serviceRegularCleaning();
    }
    @Step
    public void clickBookThisService(){
        orderPage.bookThisService();
    }
    @Step
    public void clickBookThisServiceOnPopup(){
        orderPage.bookThisServiceOnPopup();
    }
    @Step
    public void selectPaymentMethodGopay(){
        orderPage.selectPaymentMethod();
    }
    @Step
    public void inputPhoneNumber(String phoneNumber){
        orderPage.phoneNumber(phoneNumber);
    }
    @Step
    public void inputQuantity(String quantity){
        orderPage.quantity(quantity);
    }
    @Step
    public void selectCityIsJakartaBarat(){
        orderPage.selectCity();
    }
    @Step
    public void inputPickUpDate(String date){
        orderPage.selectPickUpDate(date);
    }
    @Step
    public void inputAddress(String address){
        orderPage.address(address);
    }
    @Step
    public void clickConfirmOrder(){
        orderPage.clickConfirmOrder();
    }
    @Step
    public void clickYesOnPopup(){
        orderPage.clickYesOnPopup();
    }
    @Step
    public void clickOkOrderSuccess(){
        orderPage.clickOkOrderSuccess();
    }
    @Step
    public void verifyPaymentInvoice(){
        assertEquals("Payment Invoice",orderPage.verifyPaymentInvoice());
    }
}

