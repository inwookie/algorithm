package jetBrains;
import java.util.Scanner;

public class jetBrains_reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        
        int reversed = 0; 

        for (;n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.print(reversed);
    }
}