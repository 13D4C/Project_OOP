package project;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateoption {
    private String formattedDate;
    private String formatted;
    
    public void setFunction() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        formatted = myDateObj.format(myFormatObj);
    }
    
    public void setText(){
        formattedDate = formatted;
    }
   
    public String getText(){
        return this.formattedDate;
    }

}
