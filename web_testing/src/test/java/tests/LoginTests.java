package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.StartPage;

public class LoginTests extends BaseMethods {

    @BeforeMethod(alwaysRun = true)
    private void loginInit() {
        startPage = new StartPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Check possibility to login with valid credentials")
    public void testLogIn() {
        startPage.clickSignUpLogInBtn();

    }

    @Test(dependsOnGroups = "Check credentials validation works correctly")
    public void testCredentialsValidation() {

    }
}
