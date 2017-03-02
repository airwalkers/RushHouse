package Abstract;
import Abstract.WebDriver.Driver;
import org.openqa.selenium.*;

/**
 * Created by liupf on 2017/3/1.
 */
public class BaseRusher {
    protected WebDriver driver;
    protected String baseUrl;

    public BaseRusher(String baseUrl) {
        this.baseUrl = baseUrl;
        driver = Driver.getChromeDriver();
    }

    public static void main(String[] args) {
        BaseRusher rusher = new BaseRusher("http://su.58.com/sushizhongxin/ershoufang/0/pn1/");
        rusher.driver.navigate().to(rusher.baseUrl);
    }
}
