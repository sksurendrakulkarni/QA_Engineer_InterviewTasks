package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePageObject {
    @FindBy(xpath = "//span[text()='Sign up or Log in']")
    private WebElement signUpLogInBtn;

    @FindBy(css = "span[class^='icon-user-lang']")
    private WebElement langIcon;

    public StartPage(WebDriver driver) {
        super(driver);
    }
}
