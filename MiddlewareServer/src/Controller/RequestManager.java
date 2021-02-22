package Controller;

import Data.Database;
import Interpreter.Expression;

public class RequestManager {
    
    private Database DB;
    private Expression XML;

    public RequestManager() {
        DB = new Database();
    }
    
    
    public String processRequest(String requestContent){
        XML.interpret(requestContent);
        
        return "";
    }
    
}
