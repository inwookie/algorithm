package jetBrains;
import java.util.Scanner;

public class jetBrains_isBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
        
        if (a >= b  && a <= c || a <= b  && a >= c) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
    
}
