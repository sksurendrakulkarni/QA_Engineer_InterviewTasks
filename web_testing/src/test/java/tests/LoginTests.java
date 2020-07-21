package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.StartPage;

public class LoginTests extends BaseMethods {

    @BeforeMethod(alwaysRun = true)
    private void loginInit() {
        startPage = new StartPage(driver);
        loginPage = new LoginPage(driver);
        driver.get("https://account.komoot.com/signin");
    }

    @Parameters({"email", "correctPassword"})
    @Test(invocationCount = 10, description = "Check possibility to login with valid credentials")
    public void testLogIn(String email, String correctPassword) {
        loginPage.fulfillEmail(email);
        loginPage.clickContinueWithEmailBtn();
        loginPage.fulfillPassword(correctPassword);
        loginPage.clickLogInBtn();
        Assert.assertTrue(startPage.isNotificationIconDisplayed());
    }
}
