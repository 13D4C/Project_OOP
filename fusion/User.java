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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
