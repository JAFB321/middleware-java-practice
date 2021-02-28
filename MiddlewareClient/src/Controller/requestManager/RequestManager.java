package Controller.requestManager;

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
//        Alumno a = new Alumno();
//        a.setEdad((byte)21);
//        a.setId(10);
//        a.setNombre("Jose");
//        String requestJSON = new JSONTools().objectToJSON(new Request(RequestType.INS, RequestSchema.Alumnos, RequestOrigin.CLIENT, a));
//        
//        Request req = (Request)new JSONTools().JSONToObject(requestJSON, Request.class);
//        
//        
//        System.out.println();
//        System.out.println(requestJSON);
//        
//        System.out.println("");
//        System.out.println(req.content);
//        
//        Object obj = new JSONTools().JSONToObject(req.content.toString(), Alumno.class);
//        
//        Alumno alm = (Alumno)obj;
//        
//        System.out.println(alm.getNombre());
//        System.out.println(alm.getId());
//        System.out.println(alm.getEdad());
//        
//        System.out.println(req.schema);
    }
}
