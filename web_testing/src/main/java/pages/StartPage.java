package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePageObject {

    @FindBy(css = "span[class^='icon-user-lang']")
    private WebElement languageIcon;

    @FindBy(xpath = "//a[@data-value='de_DE']")
    private WebElement deLanguage;

    @FindBy(css = "span[class^='icon-notifications']")
    private WebElement notificationIcon;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNotificationIconDisplayed() {
        return notificationIcon.isDisplayed();
    }

    public void clickLanguageIcon() {
        languageIcon.click();
    }

    public void clickDELanguage(WebDriver driver) {
        deLanguage.click();
    }
}
