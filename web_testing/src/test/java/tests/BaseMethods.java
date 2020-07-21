package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import pages.StartPage;

import java.util.concurrent.TimeUnit;

public class BaseMethods {
    WebDriver driver;
    LoginPage loginPage;
    StartPage startPage;

    @Parameters({"url"})
    @BeforeMethod(alwaysRun = true)
    protected void baseInit(String url) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    protected void quit() {
        driver.quit();
    }
}
