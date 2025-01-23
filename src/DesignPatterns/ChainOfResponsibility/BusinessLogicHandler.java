package DesignPatterns.ChainOfResponsibility;

public class BusinessLogicHandler implements RequestHandler{

    @Override
    public void handle(Request request) {
        if (request.isAuthorized()) {
            System.out.println("Business logic executed successfully");
        } else {
            System.out.println("Business logic execution failed");
        }
    }
    
}
