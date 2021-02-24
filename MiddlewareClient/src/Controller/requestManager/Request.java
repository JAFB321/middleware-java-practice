
package Controller.requestManager;


public class Request {
    public final RequestType type;
    public final RequestSchema schema;
    public final RequestOrigin origin;
    public final Object content;

    public Request(RequestType type, RequestSchema schema, RequestOrigin origin, Object content) {
        this.type = type;
        this.schema = schema;
        this.origin = origin;
        this.content = content;
    }
    
    
}
