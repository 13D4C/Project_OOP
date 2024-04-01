public class Employee extends User {
    public Employee(String username, String password, String id, String role) {
        super(username, password, id, role);
    }
    
    @Override
    public void displayUserInfo() {
        System.out.println("Admin Username: " + getUsername());
        System.out.println("Admin ID: " + getId());
        System.out.println("Role: " + getRole());
    }
}
