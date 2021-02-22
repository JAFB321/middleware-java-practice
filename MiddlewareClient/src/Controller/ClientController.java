package Controller;

import Connection.Client;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class ClientController implements Observer {

    private Client client;
    private RequestManager requestManager;

    public ClientController() {
        requestManager = new RequestManager();
    }

    public void init(String host, int port) throws IOException {
        client = new Client(host, port);
        client.addObserver(this);

        client.Init();
    }

    public void ManageRequest(String request) {
        String response = requestManager.processRequest(request);

        if (response.length() != 0) {
            client.SendString(response);
        }

    }

    @Override
    public void update(Observable obs, Object obj) {
        if (obs instanceof Client && obj instanceof String) {
            Client client = (Client) obs;
            ManageRequest((String) obj);
        }
    }
}
