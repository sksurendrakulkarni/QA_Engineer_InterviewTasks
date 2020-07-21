package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DiscoverPage;

public class LoginTests extends BaseMethods {

    @BeforeMethod(alwaysRun = true)
    private void loginInit() {
        discoverPage = new DiscoverPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Parameters({"signInUrl", "email", "password"})
    @Test(invocationCount = 2, description = "Check possibility to login with valid credentials")
    public void testLogIn(String signInUrl, String email, String password) {
        driver.get(signInUrl);
        loginPage.fulfillEmail(email);
        loginPage.clickContinueWithEmailBtn();
        loginPage.fulfillPassword(password);
        loginPage.clickLogInBtn();
        Assert.assertTrue(discoverPage.isNotificationIconDisplayed());
    }
}
