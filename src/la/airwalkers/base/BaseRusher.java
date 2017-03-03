package la.airwalkers.base;
import la.airwalkers.base.webdriver.Driver;
import la.airwalkers.model.House;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liupf on 2017/3/1.
 */
public abstract class BaseRusher {
    protected WebDriver driver;
    protected String baseUrl;

    public BaseRusher(String baseUrl) {
        this.baseUrl = baseUrl;
        driver = Driver.getChromeDriver();
    }

    public List<House> getHouses(int start, int end) {
        List<House> houses = read(start, end);
        quit();
        return houses;
    }

    public abstract List<House> read(int start, int end);

    public void quit() {
        driver.quit();
    }

    public static void main(String[] args) {
//        BaseRusher rusher = new BaseRusher("http://su.58.com/sushizhongxin/ershoufang/0/pn1/");
//        rusher.driver.navigate().to(rusher.baseUrl);
    }
}
