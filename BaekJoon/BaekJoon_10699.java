import java.util.Date;
import java.text.SimpleDateFormat;  

public class BaekJoon_10699 {
    public static void main(String[] args) {
        Date date = new Date();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }    
}
