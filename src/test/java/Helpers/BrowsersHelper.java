package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowsersHelper {

    public static WebDriver getChromeLocalWebDriver () {
        System.setProperty("webdriver.chrome.driver", ".//WebDrivers//chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--window-size=1920x1080");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
