package la.airwalkers.base.webdriver;

import org.openqa.selenium.WebDriver;

/**
 * Created by liupf on 2017/3/1.
 */
public abstract class Driver {
    public abstract WebDriver create();
    private static Driver driver;

    public static WebDriver getChromeDriver(){
        driver = new ChromeFactory();
        return driver.create();
    }

    public static WebDriver getFireFoxDriver() {
        driver = new FireFoxFactory();
        return driver.create();
    }
}
