package DesignPatterns.ChainOfResponsibility;

public class AuthenticationHandler implements RequestHandler{

    @Override
    public void handle(Request request) {
        if (request.getUserRole() != null) {
            request.setAuthenticated(true);
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            return;
        }
    }
    
}
