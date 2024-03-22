
public class Project {
    private String name;
    private Employee employee;
    private String customerName;
    private double price;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setEmployee(String name, int handle) {
        employee = new Employee(name, handle);
    }
    public Employee getEmployee() {
        return this.employee;
    }
    public void setPrice(double price) {
        this.price = price;
    } 
    
    public double getPrice() {
        return this.price;
    }
}
