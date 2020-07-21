package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebDriverWait {
    private static org.openqa.selenium.support.ui.WebDriverWait waiter;

    public static org.openqa.selenium.support.ui.WebDriverWait getWaiter(WebDriver driver) {
        if (driver == null) {
            waiter = new org.openqa.selenium.support.ui.WebDriverWait(driver, 5);
        }
        return waiter;
    }

    public static void waitUntilElementIsPresent(WebDriver driver, WebElement element) {
        WebDriverWait.getWaiter(driver).until(ExpectedConditions.visibilityOf(element));
    }
}
