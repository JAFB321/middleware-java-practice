package Controller;

import Interpreter.Expression;
import Interpreter.JsonExpression;

public class RequestManager {
    
    private Expression JSON = new JsonExpression();

    public RequestManager() {
       
    }
    
    
    public String processRequest(String requestContent){
        String xmlRequest = JSON.interpret(requestContent);
        
        return ";
    }
    
}