package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageObject {
    private WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        //initElements runs through all current class' fields and searches for annotations.
        // if there is annotation @FindBy -> it transformed to simple instance of By class
        //'lazy proxying' invocation. without it we will get NullPointerException.
        PageFactory.initElements(driver, this);
    }
}
