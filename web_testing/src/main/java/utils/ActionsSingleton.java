package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSingleton {
    private static Actions actions;

    public static Actions getActionsInstance(WebDriver driver) {
        if(actions == null) {
            actions = new Actions(driver);
        }
        return actions;
    }
}
