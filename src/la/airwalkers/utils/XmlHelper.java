package la.airwalkers.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

/**
 * Created by liupf on 2017/3/3.
 */
public class XmlHelper {
    private Document doc;
    private Element root;

    public XmlHelper(String url) throws DocumentException {
        doc = getDocument(url);
        root = doc.getRootElement();
    }

    public Document getDocument(String url) throws DocumentException {
        SAXReader reader = new SAXReader();
        return reader.read(url);
    }

    public Iterator getElementsByTag(String tagname) {
        return root.elementIterator(tagname);
    }



}
