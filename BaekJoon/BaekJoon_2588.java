import java.util.Scanner;

public class BaekJoon_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        scanner.close();
        System.out.print(num1 * (num2 % 10));
        System.out.print(num1 * ((num2 % 100) / 10));
        System.out.print(num1 * (num2 / 100));
        System.out.print(num1 * num2);                         
  }
}

