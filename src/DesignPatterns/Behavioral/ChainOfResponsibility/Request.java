package DesignPatterns.Behavioral.ChainOfResponsibility;

public class Request {
    private String userRole;
    private boolean isAuthenticated;
    private boolean isAuthorized;

    public String getUserRole() { return userRole; }
    public void setUserRole(String userRole) { this.userRole = userRole; }
    public boolean isAuthenticated() { return isAuthenticated; }
    public void setAuthenticated(boolean authenticated) { isAuthenticated = authenticated; }
    public boolean isAuthorized() { return isAuthorized; }
    public void setAuthorized(boolean authorized) { isAuthorized = authorized; }
}
