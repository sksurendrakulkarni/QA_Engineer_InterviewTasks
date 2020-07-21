package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsSingleton;
import utils.JSExecutor;

public class StartPage extends BasePageObject {
    @FindBy(xpath = "//span[text()='Sign up or Log in']")
    private WebElement signUpLogInBtn;

    @FindBy(css = "span[class^='icon-user-lang']")
    private WebElement languageIcon;

    @FindBy(css = "span[class^='icon-notifications']")
    private WebElement notificationIcon;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpLogInBtn(WebDriver driver) {
        ActionsSingleton.getActionsInstance(driver).doubleClick(signUpLogInBtn).perform();
        JSExecutor.clickElementUsingJSExecutor(driver, signUpLogInBtn);
        signUpLogInBtn.click();
    }

    public boolean isNotificationIconDisplayed() {
        return notificationIcon.isDisplayed();
    }
}
