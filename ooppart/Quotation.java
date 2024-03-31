package ooppart;

import java.util.ArrayList;


public class Quotation {
    private String note;
    private Project project;
    private ArrayList<Goods>goodsbox = new ArrayList<Goods>();
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public String getNote() {
        return this.note;
    }
    
    public void setProject(String name,String employee, String role, double price) {
        this.project = new Project(name, employee, role, price);
    }
    
    public Project getProject() {
        return this.project;
    }
    
    public void addGoods(String name, double price, String goodsID, int count) {
        this.goodsbox.add(new Goods(name, price, goodsID, count));
    }
    
    public void moneyCalculate() {
        
    }
    
    public void save() {
        
    }
    
    public void Export() {
        
    }
    
}
