package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.LandingPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LandingStep {
    LandingPage landingPage;

    @Step
    public void verifyLandingPage(){
        assertTrue(landingPage.logoIsDisplay());
        assertEquals("Find Us", landingPage.findUsDisplay());
        assertEquals("About Us", landingPage.aboutUsDisplay());
        assertEquals("Account", landingPage.accountDisplay());
        assertTrue(landingPage.verifySwiperWrapper());
    }

}
