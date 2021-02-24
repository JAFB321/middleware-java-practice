package Controller;

import Controller.requestManager.pendingRequest;
import Controller.requestManager.RequestManager;
import Connection.Client;
import Controller.requestManager.RequestSchema;
import Controller.requestManager.RequestType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ClientController implements Observer {
    
    // Singleton
    private static ClientController Instance = null;
    
    public static ClientController getInstance(){
        if(Instance == null){
            Instance = new ClientController();
        }else{
            Instance = new ClientController();
        }
        return Instance;
    }
    
    private ClientController() {
        requestManager = new RequestManager();
    }
    
    private Client client;
    private RequestManager requestManager;
    private ArrayList<pendingRequest> pendingRequests =  new ArrayList<pendingRequest>();
    
    public void init(String host, int port) throws IOException {
        client = new Client(host, port);
        client.addObserver(this);

        client.Init();
    }

    public Object sendRequestToServer(RequestSchema schema, RequestType type, Object content){
        pendingRequest req = new pendingRequest("1", type, schema);
        pendingRequests.add(req);
        
        client.SendString("{\"type\": \"Alumnos_LIST\"}");
        
        return req.waitResponse();
    }
            
    private void ManageRequest(String request) {
        String json = requestManager.processRequest(request);
            
        for (pendingRequest pending : pendingRequests) {
            if(!pending.isSolved()){
                pending.solve(json);
            }
        }
    }

    @Override
    public void update(Observable obs, Object obj) {
        System.out.println("update observer: ");
        System.out.println(obj);
        if (obs instanceof Client && obj instanceof String) {
            Client client = (Client) obs;
            ManageRequest((String) obj);
        }
    }
}
