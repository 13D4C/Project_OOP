package project;


public abstract class User {
    private String username;
    private String password;
    private final String id;
    private final String role;
    public static final int MAX_PASSWORD_LENGTH = 20;
    
    public User(String username, String password, String id, String role) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.role = role;
    }
}
