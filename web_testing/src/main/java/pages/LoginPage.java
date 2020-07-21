package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//div[text()='Continue with Email']")
    private WebElement continueWithEmailBtn;

    @FindBy(xpath = "//div[text()='Log In']")
    private WebElement logInBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fulfillEmail(String email) {
        emailField.sendKeys(email);
    }

    public void fulfillPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickContinueWithEmailBtn() {
        continueWithEmailBtn.click();
    }

    public void clickLogInBtn() {
        logInBtn.click();
    }

}
