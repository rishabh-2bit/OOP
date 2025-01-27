package DesignPatterns.Behavioral.ChainOfResponsibility;

import java.util.List;

public class RequestProcessor {

    private final List<RequestHandler> handlers;

    public RequestProcessor(List<RequestHandler> handlers) {
        this.handlers = handlers;
    }

    public void process(Request request) {
        for (RequestHandler handler : handlers) {
            handler.handle(request);
            if (!request.isAuthenticated() || !request.isAuthorized()) {
                break;
            }
        }
    }
    
}
