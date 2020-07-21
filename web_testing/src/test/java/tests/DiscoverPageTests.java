package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.DiscoverPage;

public class DiscoverPageTests extends BaseMethods {

    @Parameters({"pageLoadWaitTime", "signInUrl", "email", "password"})
    @BeforeMethod(alwaysRun = true)
    public void startPageInit(int pageLoadWaitTime, String signInUrl, String email, String password) throws InterruptedException {
        this.logIn(signInUrl, email, password);
        Thread.sleep(pageLoadWaitTime);
        discoverPage = new DiscoverPage(driver);
    }

    @Test
    public void checkPossibilityToSearchForATour() {
        discoverPage.clickSearchBtn();
        discoverPage.saveATour();
        discoverPage.clickGotItBtn(driver);
        discoverPage.clickOnUserIndicator();
        discoverPage.clickOnToursLink();
        Assert.assertTrue(discoverPage.isTourAvailable());
    }
}
