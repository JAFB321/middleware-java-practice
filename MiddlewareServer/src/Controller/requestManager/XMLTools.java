package Controller.requestManager;

import Interpreter.Tools;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLTools {

    public XMLTools() {
    }

    public String objectToXML(Object obj) {
        XStream xstream = new XStream(new DomDriver());
        return xstream.toXML(obj);
    }

    public Object XMLToObject(String xml, Class<?> type) {
        String xs = Tools.XMLtoJSON(xml);
        return new JSONTools().JSONToObject(xs, type);
    }
//
    public Object XMLToObject(String xml) {
        XStream xstream = new XStream(new DomDriver());
        return xstream.fromXML(xml);
    }

}
