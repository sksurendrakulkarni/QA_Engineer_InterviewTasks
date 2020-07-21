package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.StartPage;

public class StartPageTests extends BaseMethods {

    @BeforeMethod
    public void startPageInit() {
        startPage = new StartPage(driver);
    }

    @Parameters({"deUrl"})
    @Test(description = "Check language can be switched")
    public void checkLanguageCanSwitch(String deUrl) {
        startPage.clickLanguageIcon();
        startPage.clickDELanguage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), deUrl);
    }
}
