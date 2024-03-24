package ooppart;
public class Project {
    private String name;
    private Employee employee;
    private String customerName;
    private double price;
    
    public Project(String name,String employee, double price) {
        this.name = name;
        this.employee = new Employee(employee);
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setEmployee(String name) {
        this.employee = new Employee(name);
    }
        
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }

    public void setPrice(double price) {
        this.price = price;
    } 
    
    public double getPrice() {
        return this.price;
    }
}
