package la.airwalkers.config;

import la.airwalkers.utils.XmlHelper;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import java.util.Iterator;

/**
 * Created by liupf on 2017/3/3.
 */
public class ConfigHelper extends XmlHelper{

    public ConfigHelper(String url) throws DocumentException {
        super(url);
    }

    public String getRoute(String id) {
        for (Iterator it = super.getElementsByTag("route"); it.hasNext(); ) {
            Element e = (Element) it.next();
            if (e.attributeValue("id").matches(id)) {
                return e.getTextTrim();
            }
        }
        return null;
    }
}
