package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSExecutor {
    private static JavascriptExecutor executor;

    public static JavascriptExecutor getJSExecutor(WebDriver driver) {
        if (executor == null) {
            executor = (JavascriptExecutor) driver;
        }
        return executor;
    }
}
