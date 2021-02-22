package middlewareserver;

import Controller.ServerController;


public class MiddlewareServer {

  
    public static void main(String[] args) {
        ServerController server = new ServerController();
        
        try {
            server.init(8080);
            System.out.println("Server is running");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
