package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DiscoverPage;

public class LoginTests extends BaseMethods {

    @Parameters({"engUrl"})
    @BeforeMethod(alwaysRun = true)
    private void loginInit(String signInUrl) {
        discoverPage = new DiscoverPage(driver);
        loginPage = new LoginPage(driver);
        driver.get(signInUrl);
    }

    @Parameters({"email", "password"})
    @Test(invocationCount = 2, description = "Check possibility to login with valid credentials")
    public void testLogIn(String email, String password) {
        loginPage.fulfillEmail(email);
        loginPage.clickContinueWithEmailBtn();
        loginPage.fulfillPassword(password);
        loginPage.clickLogInBtn();
        Assert.assertTrue(discoverPage.isNotificationIconDisplayed());
    }
}
