package jetBrains;
import java.util.Scanner;

public class jetBrains_whileLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = sc.nextInt();
        int next;
        do {
            next = sc.nextInt();
            if (next > max) {
                max = next;
            }
        } while (next != 0);
        sc.close();

        System.out.print(max);
    }
}


