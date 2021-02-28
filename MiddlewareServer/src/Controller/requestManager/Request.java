
package Controller.requestManager;


public class Request {
    
    public final String ID;
    public final Object Content;

    public Request(String ID, Object content) {
        this.ID = ID;
        this.Content = content;
    }  

    public Request() {
        this.ID = null;
        this.Content = null;
        
    }
    
    
    
}
