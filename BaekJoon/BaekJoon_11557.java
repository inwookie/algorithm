import java.util.Scanner;

public class BaekJoon_11557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int l = 0;
            String winner = ""; 
            for (int j = 0; j < n; j++) {
                String uni = sc.next();
                int uniL = sc.nextInt();
                if (uniL > l) {
                    l = uniL;
                    winner = uni; 
                } 
            }
            System.out.println(winner);
        }
    }
}
