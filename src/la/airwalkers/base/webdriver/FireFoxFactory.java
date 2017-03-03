package la.airwalkers.base.webdriver;

import la.airwalkers.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 * Created by liupf on 2017/3/2.
 * fix firefoxPath to xml on 2017/3/3
 */
public class FireFoxFactory extends Driver{

    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecko.driver", ".\\ext\\geckodriver.exe");
        File pathToBinary = new File(Config.getRoute_firefox());
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("permissions.default.image", 2);
        profile.setPreference("dom.ipc.plugins.enabled.libflashplayer.so", false);
        return new FirefoxDriver(ffBinary, profile);
    }
}
