package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import pages.RoutePlannerPage;

public class RoutePlannerTests extends BaseMethods {

    @Parameters({"pageLoadWaitTime", "signInUrl", "email", "password"})
    @BeforeMethod(alwaysRun = true)
    public void routePlannerInit(int pageLoadWaitTime, String signInUrl, String email, String password) throws InterruptedException {
        this.logIn(signInUrl, email, password);
        Thread.sleep(pageLoadWaitTime);
        routePlannerPage = new RoutePlannerPage(driver);
    }

    @Parameters({"startPoint", "destinationPoint"})
    @Test(description = "Check route planning shows details section info")
    public void checkAbilityToFindARout(String startPoint, String destinationPoint) {
        routePlannerPage.clickRoutePlannerBtn(driver);

        routePlannerPage.fulfillStartingPointField(driver, startPoint);
        routePlannerPage.selectFirstElementInTheList(driver);
        routePlannerPage.clickStartHereBtn(driver);

        routePlannerPage.fulfillDestinationPointField(driver, destinationPoint);
        routePlannerPage.selectFirstElementInTheList(driver);
        routePlannerPage.clickSetAsDestinationBt(driver);

        Assert.assertTrue(routePlannerPage.isWaytypesTitleDisplayed(driver));
    }

}
