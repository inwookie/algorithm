import java.util.Scanner;

public class BaekJoon_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int caseNum = scanner.nextInt();

        for (int i = 0; i < caseNum; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }

        scanner.close();
    }
}

