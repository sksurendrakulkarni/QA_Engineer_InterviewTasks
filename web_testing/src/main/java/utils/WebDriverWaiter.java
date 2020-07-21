package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaiter {
    private static WebDriverWait waiter;

    public static WebDriverWait getWaiter(WebDriver driver) {
        if (waiter == null) {
            waiter = new WebDriverWait(driver, 20);
        }
        return waiter;
    }

    public static void waitPageLoaded(WebDriver driver) {
        getWaiter(driver).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
