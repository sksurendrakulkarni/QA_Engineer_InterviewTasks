package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoutePlannerPage extends BasePageObject {

    //@FindBy(xpath = "//a[@title='Route planner']")
    @FindBy(linkText = "/plan")
    private WebElement routePlannerLink;

    @FindBy(xpath = "//input[@placeholder='Search For Place Or Address']")
    private WebElement whereToField;

    @FindBy(xpath = "//span[text()='Set as Destination']")
    private WebElement setAsDestinationBtn;

    public RoutePlannerPage(WebDriver driver) {
        super(driver);
    }

    public void clickRoutePlannerLink() {
        routePlannerLink.click();
    }

    public void fulfillWhereToField(String whereTo) {
        whereToField.sendKeys(whereTo);
        whereToField.sendKeys(Keys.ENTER);
    }

    public void clickSetAsDestinationBtn() {

    }
}
