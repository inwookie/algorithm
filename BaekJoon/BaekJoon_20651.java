import java.util.Scanner;

public class BaekJoon_20651 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = scanner.nextInt();
        }

        int count = n; 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double[] pair = new double[j-i+1];
                double sum = 0;
                int b = 0;

                for (int a = i; a <= j; a++, b++) {
                    pair[b] = flowers[a];
                    sum += pair[b];

                }
                double avg = sum/pair.length;
                for (double flower:pair) {
                    if (flower == avg) {
                        count++ ;
                        break;
                    }
                }
            }
        }
        System.out.print(count);
    }
    
}
