package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.DiscoverPage;

public class DiscoverPageTests extends BaseMethods {

    @BeforeMethod(alwaysRun = true)
    public void startPageInit() {
        discoverPage = new DiscoverPage(driver);
    }

    @Parameters({"deUrl"})
    @Test(description = "Check language can be switched")
    public void checkLanguageCanSwitch(String deUrl) {
        discoverPage.clickLanguageIcon();
        discoverPage.clickDELanguage();
        Assert.assertEquals(driver.getCurrentUrl(), deUrl);
    }

    @Test
    public void checkPossibilityToSearchForATour() {

    }
}
