package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(xpath = "//div[text()='Continue with Email']")
    private WebElement continueBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fulfillEmailField(String email) {
        emailField.sendKeys(email);
    }

}
