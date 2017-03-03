package la.airwalkers.config;

import la.airwalkers.utils.XmlHelper;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import java.util.Iterator;

/**
 * Created by liupf on 2017/3/3.
 */
public class Config {

    private static ConfigHelper helper;
    private static final String configXmlPath = ".//config//config.xml";

    static {
        try {
            helper = new ConfigHelper(configXmlPath);
        } catch (DocumentException ignored) {}
    }

    public static String getRoute_chromedriver() {
        return helper.getRoute("chromedriver");
    }

    public static String getRoute_firefox() {
        return helper.getRoute("firefox");
    }

    public static void main(String[] args) {
        String route_chromedriver = Config.getRoute_chromedriver();
    }
}
