package Interpreter;

import org.json.XML;
import org.json.JSONObject;

public class Tools {

    public static String XMLtoJSON(String xmlString) {
        JSONObject json = XML.toJSONObject(xmlString);
        return json.toString();
    }

    public static String JSONtoXML(String jsonString) {
        JSONObject json = new JSONObject(jsonString);
        return XML.toString(json);
    }

    public static boolean isXML(String context) {
        if (context.length() != 0 && context.trim().charAt(0) == '<') {
            return true;
        }
        return false;
    }

    public static boolean isJSON(String context) {
        if (context.length() != 0 && context.trim().charAt(0) == '{') {
            return true;
        }
        return false;
    }

}
