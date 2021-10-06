package jetBrains;
import java.util.Scanner;

public class jetBrains_move {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int n = sc.nextInt();

        sc.close();
        if (n > word.length()) {
            System.out.print(word);
        } else {
            System.out.print(word.substring(n, word.length()));
            System.out.print(word.substring(0, n));
        }

    }
}
