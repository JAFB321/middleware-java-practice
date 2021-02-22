package controller;

import Connection.Server;
import Data.Database;
import java.io.IOException;

public class ServerController {

    private Server server;
    private Database DB;
    
    public ServerController() {
    }
    
    public void init(int port) throws IOException{
        DB = new Database();
        server = new Server(port);
        
        server.Init();
    }
    
    public void 
    
    
    
}
