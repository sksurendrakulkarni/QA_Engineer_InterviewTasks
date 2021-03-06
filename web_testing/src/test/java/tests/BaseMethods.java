package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.AccountPage;
import pages.LoginPage;
import pages.DiscoverPage;
import pages.RoutePlannerPage;

import java.util.concurrent.TimeUnit;

public class BaseMethods {
    WebDriver driver;
    LoginPage loginPage;
    DiscoverPage discoverPage;
    RoutePlannerPage routePlannerPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    protected void baseInit() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    protected void logIn(String signInUrl, String email, String password) {
        driver.get(signInUrl);
        loginPage = new LoginPage(driver);
        loginPage.fulfillEmail(email);
        loginPage.clickContinueWithEmailBtn();
        loginPage.fulfillPassword(password);
        loginPage.clickLogInBtn();
    }

    @AfterMethod(alwaysRun = true)
    protected void quit() {
        driver.quit();
    }
}
