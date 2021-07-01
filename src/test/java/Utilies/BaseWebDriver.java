package Utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseWebDriver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static ThreadLocal<String> browserName = new ThreadLocal<>();

    public static WebDriver getDriver() {

        if (browserName.get()==null){
            browserName.set("chrome");
        }
        if (driver.get() == null) {
            switch (browserName.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
            }
        }
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            WebDriver webDriver=driver.get();
            webDriver = null;
            driver.set(webDriver);

        }
    }

}
