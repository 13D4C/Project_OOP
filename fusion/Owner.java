public class Owner extends User {
    public Owner(String username, String password, String id, String role) {
        super(username, password, id, role);
    }
    
    @Override
    public void displayUserInfo() {
        System.out.println("Username: " + getUsername());
        System.out.println("User ID: " + getId());
        System.out.println("Role: " + getRole());
    }
}
