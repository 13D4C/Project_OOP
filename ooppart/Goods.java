package ooppart;
public class Goods {
    private String name;
    private double price;
    private String goods_ID;
    private int count;

    public Goods(String name, double price, String goodsID, int count) {
        this.name = name;
        this.price = price;
        this.goods_ID = goodsID;
        this.count = count;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    } 
    
    public double getPrice() {
        return this.price;
    }
    
    public void setID(String goodsID) {
        this.goods_ID = goodsID;
    }
    
    public String getID() {
        return this.goods_ID;
    }
    
    public void setCount(int count) {
        this.count = count;
    } 
    
    public int getCount() {
        return this.count;
    }
}
