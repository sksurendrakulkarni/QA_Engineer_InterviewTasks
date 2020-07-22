package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ActionsSingleton;
import utils.WebDriverWaiter;


public class RoutePlannerPage extends BasePageObject {

    @FindBy(linkText = "Route planner")
    private WebElement routePlannerBtn;

    @FindBy(xpath = "//input[@placeholder='Search For Place Or Address']")
    private WebElement placeOrAddressField;

    @FindBy(xpath = "//ul[contains(@class, 'o-list-ui')]/li[1]")
    private WebElement firstElementInTheList;

    @FindBy(xpath = "//span[text()='Start Here']")
    private WebElement startHereBtn;

    @FindBy(xpath = "//span[text()='Set as Destination']")
    private WebElement setAsDestinationBtn;

    @FindBy(xpath = "//h3[text()='Waytypes']")
    private WebElement waytypesTitle;

    public void clickRoutePlannerBtn() {
        routePlannerBtn.click();
    }

    public RoutePlannerPage(WebDriver driver) {
        super(driver);
    }

    public void fulfillStartingPointField(WebDriver driver, String startingPointValue) {
        ActionsSingleton.getActionsInstance(driver).moveToElement(placeOrAddressField).click().sendKeys(startingPointValue).build().perform();
    }

    public void clickStartHereBtn(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(startHereBtn));
        startHereBtn.click();
    }

    public void fulfillDestinationPointField(WebDriver driver, String destinationValue) {
        ActionsSingleton.getActionsInstance(driver).moveToElement(placeOrAddressField).click().sendKeys(destinationValue).build().perform();
    }

    public void clickSetAsDestinationBt(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(setAsDestinationBtn));
        setAsDestinationBtn.click();
    }

    public void selectFirstElementInTheList(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(firstElementInTheList));
        ActionsSingleton.getActionsInstance(driver).moveToElement(firstElementInTheList).click().perform();
    }

    public boolean isWaytypesTitleDisplayed(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(waytypesTitle));
        return waytypesTitle.isDisplayed();
    }
}
