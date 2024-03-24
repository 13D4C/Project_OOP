package ooppart;
public class Employee {

    private String name;
    private int project_handel;

    public void Employee(String name) {
        this.name = name;
        this.project_handle = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

    public void setProject_handle(int project_handel) {
        this.project_handel = project_handel;
    }
    

    public int getProject_handle() {
        return project_handel;
    }

}
