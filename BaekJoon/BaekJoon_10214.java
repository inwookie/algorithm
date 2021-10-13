import java.util.Scanner;

public class BaekJoon_10214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String winner = "";
            int k = 0;
            int y = 0;  
            for (int j = 0; j < 9; j++) {
                y += sc.nextInt();
                k += sc.nextInt(); 
            }
            if (k > y) {
                winner = "Korea";
            } else {
                winner = "Yonsei";
            }
            System.out.println(winner);
        }
        sc.close();
    }    
}
