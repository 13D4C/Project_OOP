public class CheckFunction<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
    
    public void printContent(T content) {
        System.out.println("Content: " + content);
    }

    public static void main(String[] args) {
        CheckFunction<String> stringBox = new CheckFunction<>();
        stringBox.setContent("Complete");
        System.out.println("Status Function: " + stringBox.getContent());
        stringBox.printContent("Print me!");
        System.out.println(stringBox.getContent());
    }
}

