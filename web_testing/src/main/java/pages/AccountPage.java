package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WebDriverWaiter;

public class AccountPage extends BasePageObject {
    @FindBy(css = "span.icon-action-more")
    private WebElement actionDotsIcon;

    @FindBy(xpath = "//a[@href='/account']")
    private WebElement accountSettings;

    @FindBy(xpath = "//a[@href='#international']")
    private WebElement languageAndUnitsListItem;

    @FindBy(id = "select-language")
    private WebElement languageDropDown;

    @FindBy(xpath = "//option[@value='de_DE']")
    private WebElement languageDE;

    @FindBy(xpath = "//option[@value='en_GB']")
    private WebElement languageEN;

    @FindBy(xpath = "//h2[text()='Sprache und Einheiten']")
    private WebElement germanHeader;

    @FindBy(xpath = "//h2[text()='Language and Units']")
    private WebElement englishHeader;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickActionDotsIcon(WebDriver driver) {
        actionDotsIcon.click();
    }

    public void clickAccountSettings() {
        accountSettings.click();
    }

    public void selectLanguageAndUnitsListItem() {
        languageAndUnitsListItem.click();
    }

    public void clickLanguageDropDown() {
        languageDropDown.click();
    }

    public void selectDELanguage() {
        languageDE.click();
    }

    public boolean isHeaderInGerman(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(germanHeader));
        return germanHeader.isDisplayed();
    }

    public boolean isHeaderInEnglish(WebDriver driver) {
        WebDriverWaiter.getWaiter(driver).until(ExpectedConditions.visibilityOf(englishHeader));
        return englishHeader.isDisplayed();
    }

    public void selectENLanguage() {
        languageEN.click();
    }
}
