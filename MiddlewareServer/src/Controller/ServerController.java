package Controller;

import Connection.ClientConnection;
import Connection.Server;
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
        String response = requestManager.processRequest(request);
        
        server.sendToClients(response, IDClient);
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
}
