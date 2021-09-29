import java.util.*;

public class BaekJoon_20650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[7];
        System.out.println("enter elements");
        for (int i = 0; i < 7; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(input);
        int a = input[0];
        int b = input[1];
        int max = input[6];
        int c = max - a - b; 

        System.out.print(a + " " + b + " " + c);
  }
}

