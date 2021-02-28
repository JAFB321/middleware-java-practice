package Controller.requestManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONTools {

    public String objectToJSON(Object obj) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(obj);
    }

    public  Object JSONToObject(String json, Class<?> type) {
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }
}
