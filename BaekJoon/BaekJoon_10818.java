import java.util.*;

public class BaekJoon_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(input);
        int a = input[0];
        int b = input[n-1];

        System.out.print(a + " " + b);
  }
}