package Controller.requestManager;

public class pendingRequest {

    public final String ID;

    
    private boolean solved;
    private Object response;

    public pendingRequest(String ID) {
        this.ID = ID;
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
