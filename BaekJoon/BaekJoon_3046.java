import java.util.Scanner;

public class BaekJoon_3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int s = sc.nextInt();
        
        sc.close();
        
        System.out.print(2 * s - r1);
    }
}
