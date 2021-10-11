package jetBrains;
import java.util.Scanner;

public class jetBrains_password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        String[] arrA  = new String[]{"A", "B"};
        String[] arrB = new String[]{"a", "b"};
        int[] arrC = new int[]{1, 2};

        int remain = n - a - b - c;

        int checkA = 0; 
        while (a != 0) {
            if (checkA == 0) {
                System.out.print(arrA[0]);
                checkA++;
                a--;
            } else {
                System.out.print(arrA[1]);
                checkA--;
                a--;
            }
        }

        int checkB = 0;
        while (b != 0) {
            if (checkB == 0) {
                System.out.print(arrB[0]);
                checkB++;
                b--;
            } else {
                System.out.print(arrB[1]);
                checkB--;
                b--;
            }
        }

        int checkC = 0;
        while (c != 0) {
            if (checkC == 0) {
                System.out.print(arrC[0]);
                checkC++;
                c--;
            } else {
                System.out.print(arrC[1]);
                checkC--;
                c--;
            }
        }

        if (n > a + b + c) {
            int checkN = 0; 
            while (remain != 0) {
                if (checkN == 0) {
                    System.out.print(arrA[0]);
                    checkN++;
                    remain--;
                } else {
                    System.out.print(arrA[1]);
                    checkN--;
                    remain--;
                }
            }
        }
    }
}

