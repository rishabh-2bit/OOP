package DesignPatterns.ChainOfResponsibility;
import java.util.Arrays;
import java.util.List;

public class RequestProcessorDemo {
                public static void main(String[] args) {
                    RequestHandler authenticationHandler = new AuthenticationHandler();
                    RequestHandler authorizationHandler = new AuthorizationHandler();
                    RequestHandler businessLogicHandler = new BusinessLogicHandler();
                    List<RequestHandler> handlers = Arrays.asList(authenticationHandler,authorizationHandler,businessLogicHandler);

                    RequestProcessor requestProcessor = new RequestProcessor(handlers);

                    String role = "USER";
                    Request request = new Request();
                    request.setUserRole(role);
                    request.setAuthenticated(false);
                   requestProcessor.process(request);
                   if (request.isAuthenticated() && request.isAuthorized()) {
                       System.out.println("Request processed successfully!");
                    } else {
                        System.out.println("Request failed!");
                }
    }

}
