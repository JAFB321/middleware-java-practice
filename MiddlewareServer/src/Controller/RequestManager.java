package Controller;

import Data.Database;
import Interpreter.Expression;
import Interpreter.XmlExpression;

public class RequestManager {
    
    private Database DB;
    private Expression XML = new XmlExpression();

    public RequestManager() {
        DB = new Database();
    }
    
    
    public String processRequest(String requestContent){
        String xmlRequest = XML.interpret(requestContent);
        
        return "";
    }
    
}
