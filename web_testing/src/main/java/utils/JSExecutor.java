package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutor {
    private static JavascriptExecutor executor;

    public static JavascriptExecutor getJSExecutor(WebDriver driver) {
        if (executor == null) {
            executor = (JavascriptExecutor) driver;
        }
        return executor;
    }

    public static void clickElementUsingJSExecutor(WebDriver driver, WebElement element) {
        getJSExecutor(driver).executeScript("arguments[0].click();", element);
    }
}
