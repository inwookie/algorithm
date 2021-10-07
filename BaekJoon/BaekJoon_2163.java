import java.util.Scanner; 

public class BaekJoon_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        System.out.print(n - 1 + n * (m -1));
    }
}
