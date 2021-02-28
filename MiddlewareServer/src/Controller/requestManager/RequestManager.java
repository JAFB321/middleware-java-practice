package Controller.requestManager;

import Data.Database;
import Data.dto.Alumno;
import Data.dto.AlumnoRequest;
import Interpreter.Expression;
import Interpreter.XmlExpression;

public class RequestManager {
    
    private Database DB = new Database();
    private Expression XML = new XmlExpression();
    private XMLTools xmlTools = new XMLTools();
    
    

    public Request processRequest(String requestContent) {
        String requestJSON = XML.interpret(requestContent);
        Request req = (Request) xmlTools.XMLToObject(requestJSON, Request.class);
        
        if(req.ID.contains("Alumno")){
            AlumnoRequest areq = (AlumnoRequest) xmlTools.XMLToObject(requestJSON, AlumnoRequest.class);
            Alumno alm = DB.getAlumnos(areq.Content.getId());
            return new Request(req.ID, alm);
        }
        
        return req;
    }

    public String prepareRequest(Object content, String requestID) {
        String requestXML= xmlTools.objectToXML(new Request(requestID, content));

        return requestXML;
    }

    
    public static void main(String[] args) {
        XMLTools xmlTools = new XMLTools();
        Expression XML = new XmlExpression();
        
        String test = "{\n" +
"  \"ID\": \"Alumno_GET\",\n" +
"  \"Content\": {\n" +
"    \"id\": 1,\n" +
"    \"nombre\": \"Jose\",\n" +
"    \"calificaciones\": [\n" +
"      1,\n" +
"      2,\n" +
"      3\n" +
"    ]\n" +
"  }\n" +
"}";
        String xmled = XML.interpret(test);
        
        
        
        AlumnoRequest xreq = (AlumnoRequest)xmlTools.XMLToObject(xmled, AlumnoRequest.class);
        
        System.out.println(xreq.Content);
        System.out.println(xreq.Content.toString());
        
//        Alumno alm = new Alumno(1, "Jose", new int[]{1,2,3});
//        Request req = new Request("REQUEST_ID", alm);
//        
//        String axml = xmlTools.objectToXML(alm);
//        String reqxml = xmlTools.objectToXML(req);
        
//        Request newReq = (Request)xmlTools.XMLToObject(reqxml);
        
//        System.out.println(axml);
//System.out.println("XML:");
//        System.out.println(reqxml);
//        
//        System.out.println("\n OBJECT:");
//        System.out.println(newReq.ID);
//        System.out.println(((Alumno)newReq.content).getId());
//        System.out.println(((Alumno)newReq.content).getNombre());
//        System.out.println(((Alumno)newReq.content).getCalificaciones()[2]);
    }
    
}
