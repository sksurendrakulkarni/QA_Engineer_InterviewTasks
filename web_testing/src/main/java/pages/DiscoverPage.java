package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverPage extends BasePageObject {

    @FindBy(css = "span[class^='icon-user-lang']")
    private WebElement languageIcon;

    @FindBy(xpath = "//a[@data-value='de_DE']")
    private WebElement deLanguage;

    @FindBy(css = "span[class^='icon-notifications']")
    private WebElement notificationIcon;

    @FindBy(xpath = "//span[contains(@class, 'icon-sport-mtb')]")
    private Web

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
}
