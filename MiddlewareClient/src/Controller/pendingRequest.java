package Controller;

public class pendingRequest {

    public final String ID;
    public final String Type;
    private boolean solved;
    private Object response;

    public pendingRequest(String ID, String Type) {
        this.Type = Type;
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
