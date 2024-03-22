import java.util.ArrayList;

public class offer_price {
    private String note;
    private Project project;
    private ArrayList<Goods>goods = new ArrayList<Goods>();
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public String getNote() {
        return this.note;
    }
    
    public void setProject(String name,String employee, double price) {
        this.project = new Project(name, employee, price);
    }
    
    public Project getProject() {
        return this.project;
    }
    
    public void addGoods(String name, double price, String goodsID, int count) {
        this.goods.add(new Goods(name, price, goodsID, count));
    }
    
    public void moneyCalculate() {
        
    }
    
    public void save() {
        
    }
    
    public void Export() {
        
    }
    
}
