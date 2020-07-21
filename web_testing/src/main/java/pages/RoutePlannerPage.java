package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ActionsSingleton;
import utils.JSExecutor;
import utils.WebDriverWaiter;

import java.security.Key;

public class RoutePlannerPage extends BasePageObject {

    @FindBy(linkText = "Route planner")
    private WebElement routePlannerBtn;

    @FindBy(css = "input.mousetrap")
    private WebElement placeOrAddressField;

    @FindBy(xpath = "(//li/div[contains(@class, 'o-media')])[1]")
    private WebElement firstElementInTheList;

    @FindBy(xpath = "//span[text()='Start Here']")
    private WebElement startHereBtn;

    @FindBy(xpath = "//span[text()='Set as Destination']")
    private WebElement setAsDestinationBtn;

    @FindBy(xpath = "//h3[text()='Waytypes']")
    private WebElement waytypesTitle;

    public void clickRoutePlannerBtn(WebDriver driver) {
        WebDriverWaiter.waitPageLoaded(driver);
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(routePlannerBtn));
        ActionsSingleton.getActionsInstance(driver).moveToElement(routePlannerBtn).click().build().perform();
    }

    public RoutePlannerPage(WebDriver driver) {
        super(driver);
    }

    public void fulfillStartingPointField(WebDriver driver, String startingPointValue) {
        WebDriverWaiter.waitPageLoaded(driver);
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(placeOrAddressField));
        ActionsSingleton.getActionsInstance(driver).moveToElement(placeOrAddressField).click().sendKeys(startingPointValue).build().perform();
    }

    public void clickStartHereBtn(WebDriver driver) {
        WebDriverWaiter.waitPageLoaded(driver);
        startHereBtn.click();
    }

    public void fulfillDestinationPointField(WebDriver driver, String destinationValue) {
        WebDriverWaiter.waitPageLoaded(driver);
        ActionsSingleton.getActionsInstance(driver).moveToElement(placeOrAddressField).click().sendKeys(destinationValue).build().perform();
    }

    public void clickSetAsDestinationBt(WebDriver driver) {
        WebDriverWaiter.waitPageLoaded(driver);
        setAsDestinationBtn.click();
    }

    public void selectFirstElementInTheList(WebDriver driver) {
        WebDriverWaiter.waitPageLoaded(driver);
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(firstElementInTheList));
        firstElementInTheList.click();
    }

    public boolean isWaytypesTitleDisplayed(WebDriver driver) {
        WebDriverWaiter.waitPageLoaded(driver);
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(waytypesTitle));
        return waytypesTitle.isDisplayed();
    }
}
