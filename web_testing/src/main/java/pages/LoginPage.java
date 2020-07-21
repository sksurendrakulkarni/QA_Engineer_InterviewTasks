package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//div[text()='Continue with Email']")
    private WebElement continueBtn;

    @FindBy(xpath = "//div[text()='Log In']")
    private WebElement logInBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fulfillEmailAndPassword(WebDriver driver, String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }

    public void clickLogInBtn() {
        logInBtn.click();
    }

}
