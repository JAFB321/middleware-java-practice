package Controller.requestManager;

import Data.dto.Alumno;
import Interpreter.Expression;
import Interpreter.JsonExpression;
import java.util.Random;

public class RequestManager {
    
    private Expression JSON = new JsonExpression();
    private JSONTools jsonTools = new JSONTools();
            
            
    public Request processRequest(String requestContent){
        String requestJSON = JSON.interpret(requestContent);
        Request req = (Request)jsonTools.JSONToObject(requestJSON, Request.class);
        
        return req;
    }
    
    public String prepareRequest(Object content){
        String requestJSON = jsonTools.objectToJSON(new Request(getNewRequestID(), content));
       
        return requestJSON;
    }
    
    public String getNewRequestID(){
        Random rd = new Random();
        return "REQUEST_"+rd.nextInt();
    }
    
    public static void main(String[] args) {
        JSONTools jsonTools = new JSONTools();
        
        Alumno alm = new Alumno(1, "Jose", new int[]{1,2,3});
        Request req = new Request("REQUEST_ID", alm);
        
        String jsonaml = jsonTools.objectToJSON(req);
        
        System.out.println(jsonaml);
    }
}
