package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.DiscoverPage;

public class DiscoverPageTests extends BaseMethods {

    @Parameters({"pageLoadWaitTime", "signInUrl", "email", "password"})
    @BeforeMethod(alwaysRun = true)
    public void startPageInit(int pageLoadWaitTime, String signInUrl, String email, String password) throws InterruptedException {
        this.logIn(signInUrl, email, password);
        Thread.sleep(pageLoadWaitTime);
        discoverPage = new DiscoverPage(driver);
    }

/*
    @Parameters({"discoverUrl"})
    @Test
    public void checkPossibilityToSearchForATour(String discoverUrl) throws InterruptedException {
        discoverPage.clickSearchBtn(driver);
        discoverPage.saveATour(driver);
        discoverPage.clickGotItBtn(driver);
        discoverPage.clickOnUserIndicator();
        discoverPage.clickOnToursLink();
        Assert.assertTrue(discoverPage.isTourAvailable());
    }*/
}
