package Controller.requestManager;

import Controller.requestManager.RequestSchema;
import Controller.requestManager.RequestType;

public class pendingRequest {

    public final String ID;
    public final RequestType Type;
    public final RequestSchema Schema;
    
    private boolean solved;
    private Object response;

    public pendingRequest(String ID, RequestType Type, RequestSchema Schema) {
        this.ID = ID;
        this.Type = Type;
        this.Schema = Schema;
    }
    
    
    
    public boolean isSolved(){
        return solved;
    }

    public void solve(Object response) {
        this.response = response;
        solved = true;
    }

    public Object waitResponse() {
        while (!solved) {}
        return response;
    }

}
