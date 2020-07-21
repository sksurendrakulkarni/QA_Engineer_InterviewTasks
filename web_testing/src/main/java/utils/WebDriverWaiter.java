package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaiter {
    private static WebDriverWait waiter;

    public static WebDriverWait getWaiter(WebDriver driver) {
        if (waiter == null) {
            waiter = new WebDriverWait(driver, 10);
        }
        return waiter;
    }
}
