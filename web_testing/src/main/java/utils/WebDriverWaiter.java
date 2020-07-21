package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaiter {
    private static WebDriverWait waiter;

    public static WebDriverWait getWaiter(WebDriver driver) {
        if (driver == null) {
            waiter = new WebDriverWait(driver, 2);
        }
        return waiter;
    }

    public static void waitUntilElementIsPresent(WebDriver driver, WebElement element) {
        getWaiter(driver).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilPageIsFullyLoaded(WebDriver driver) {
        //JSExecutor.getJSExecutor(driver).executeScript("return document.readyState").equals("complete");
        Wait<WebDriver> wait = new WebDriverWait(driver, 5);
        wait.until(driver1 -> String
                .valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState"))
                .equals("complete"));
    }
}
