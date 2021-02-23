
package middlewareclient;

import Controller.ClientController;


public class MiddlewareClient {


    public static void main(String[] args) {
        ClientController client = new ClientController();
        
        try {
            client.init("localhost", 8080);
            
            Object a = client.sendRequestToServer();
            Object b = client.sendRequestToServer();
            Object c = client.sendRequestToServer();
            Object d = client.sendRequestToServer();
            
            System.out.println("RESPONSE:");
            System.out.println(a);
        } catch (Exception e) {
        }
    }
    
}
