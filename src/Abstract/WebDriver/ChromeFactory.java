package Abstract.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by liupf on 2017/3/1.
 */
public class ChromeFactory extends Driver {

    @Override
    public WebDriver create(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        op.addExtensions(new File(".\\ext\\blockimage.crx"));
        WebDriver driver = new ChromeDriver(op);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        return driver;
    }

}
