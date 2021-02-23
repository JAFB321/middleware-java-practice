package Controller;

import Interpreter.Expression;
import Interpreter.JsonExpression;
import java.util.ArrayList;

public class RequestManager {
    
    private Expression JSON = new JsonExpression();
    


    public RequestManager() {
        
    }
  
    
    
    public String processRequest(String requestContent){
        return JSON.interpret(requestContent);
    }
    
}
