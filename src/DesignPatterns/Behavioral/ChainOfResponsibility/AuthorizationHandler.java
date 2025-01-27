package DesignPatterns.Behavioral.ChainOfResponsibility;

public class AuthorizationHandler implements RequestHandler{

    @Override
    public void handle(Request request) {
       if (request.isAuthenticated() && "ADMIN".equals(request.getUserRole())) {
            request.setAuthorized(true);
            System.out.println("Authorization successful");
        } else {
            System.out.println("Authorization failed");
            return;
        }
    }
    
}
