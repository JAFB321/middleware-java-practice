package Controller;

import Connection.ClientConnection;
import Connection.Server;
import Controller.requestManager.Request;
import Controller.requestManager.RequestManager;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class ServerController implements Observer {

    private Server server;
    private RequestManager requestManager;
    
    
    public ServerController() {
        requestManager = new RequestManager();
    }
    
    public void init(int port) throws IOException{
        server = new Server(port);
        server.addObserver(this);
        
        server.Init();
    }
    
    public void ManageRequest(String IDClient, String request){
        Request responseRequest = requestManager.processRequest(request);
        String response = requestManager.prepareRequest(responseRequest.Content, responseRequest.ID);
        
        System.out.println(response);
        
        //server.sendToClients(response, IDClient);
        System.out.println("responsed");
    }
    
    public void send(String content){
        server.sendToClients(content);
    }
    
    
    public void observeClient(ClientConnection client){
        client.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object obj) {
        if(obj instanceof ClientConnection){
            observeClient((ClientConnection)obj);
        }
        else if (obs instanceof ClientConnection && obj instanceof String){
            ClientConnection client = (ClientConnection)obs;
            ManageRequest(client.ID, (String)obj);
        }
    }
    
    public static void main(String[] args) {
        ServerController con = new ServerController();
        con.ManageRequest("CLIENT1", "{\n" +
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
"}");
    }
}
