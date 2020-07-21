package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTests extends BaseMethods {

    @Parameters({"pageLoadWaitTime", "signInUrl", "email", "password"})
    @BeforeMethod(alwaysRun = true)
    public void accountPageInit(int pageLoadWaitTime, String signInUrl, String email, String password) throws InterruptedException {
        this.logIn(signInUrl, email, password);
        accountPage = new AccountPage(driver);
        Thread.sleep(pageLoadWaitTime);
    }

    @Test(description = "Check language can be switched")
    public void checkLanguageCanBeSwitched() {
        accountPage.clickActionDotsIcon();
        accountPage.clickAccountSettings();
        accountPage.selectLanguageAndUnitsListItem();
        accountPage.clickLanguageDropDown();
        accountPage.selectDELanguage();
        Assert.assertTrue(accountPage.isHeaderInGerman(driver));
    }
}
