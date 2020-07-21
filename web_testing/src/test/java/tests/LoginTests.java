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
    }

    @Parameters({"email", "correctPassword"})
    @Test(description = "Check possibility to login with valid credentials")
    public void testLogIn(String email, String correctPassword) {
        startPage.clickSignUpLogInBtn(driver);
        loginPage.fulfillEmailAndPassword(driver, email, correctPassword);
        loginPage.clickLogInBtn();
        Assert.assertTrue(startPage.isNotificationIconDisplayed());
    }
/*
    @Parameters({"email", "incorrectPassword"})
    @Test(description = "Check credentials validation works correctly")
    public void testCredentialsValidation() {

    }
*/
}
