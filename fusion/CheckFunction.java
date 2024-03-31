package project;

public class CheckFunction<t> {
    private t content;
    
    public void setContent(t content){
        this.content = content;
    }
    
    public t getContent(){
        return content;
    }
    
    public static void main(String[] args) {
        CheckFunction<String> stringBox = new  CheckFunction<>();
        stringBox.setContent("Complete");
        System.out.println("Status Function: " + stringBox.getContent());
    }
}
