package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WebDriverWaiter;

public class DiscoverPage extends BasePageObject {

    @FindBy(css = "span[class^='icon-user-lang']")
    private WebElement languageIcon;

    @FindBy(xpath = "//a[@data-value='de_DE']")
    private WebElement deLanguage;

    @FindBy(css = "span[class^='icon-notifications']")
    private WebElement notificationIcon;

    @FindBy(xpath = "//input[@placeholder='Where to?']")
    private WebElement whereToField;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//span[contains(text(), 'bike ride')]")
    private WebElement bikeRideTextOnThePage;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveATourBtn;

    @FindBy(xpath = "//span[text()='Got it!']")
    private WebElement gotItBtn;

    @FindBy(css = "div.c-page-index__indicator--user")
    private WebElement userIndicator;

    @FindBy(linkText = "Tours")
    private WebElement toursLink;

    @FindBy(xpath = "div.c-background-image")
    private WebElement imageOfAvailableTour;

    @FindBy(css = "li[data-tour-id]")
    private WebElement addedTour;

    @FindBy(xpath = "//a[text()='Delete']")
    private WebElement deleteTourLink;

    @FindBy(xpath = "//a[text()='I’m Sure!']")
    private WebElement confirmDeleteTourLink;

    public DiscoverPage(WebDriver driver) {
        super(driver);
    }

    public void clickLanguageIcon() {
        languageIcon.click();
    }

    public void clickDELanguage() {
        deLanguage.click();
    }

    public boolean isNotificationIconDisplayed() {
        return notificationIcon.isDisplayed();
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void saveATour() {
        saveATourBtn.click();
    }

    public void clickGotItBtn(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(gotItBtn));
        gotItBtn.click();
    }

    public void clickOnUserIndicator() {
        userIndicator.click();
    }

    public void clickOnToursLink() {
        toursLink.click();
    }

    public boolean isTourAvailable() {
        return addedTour.isDisplayed();
    }

    public void clickDeleteTourLink() {
        deleteTourLink.click();
    }

    public void clickConfirmDeleteTourLink() {
        confirmDeleteTourLink.click();
    }
}
