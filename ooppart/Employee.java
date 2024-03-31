package ooppart;


public class Employee {
    private String name;
    private int projectHandle = 0;
    private String role;
    
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
  
    public void setHandle(int projectHandle) {
        this.projectHandle = projectHandle;
    }
  
    public int getHandle() {
        return this.projectHandle;
    }
    
    public String getRole() {
        return this.role;
    }
}
