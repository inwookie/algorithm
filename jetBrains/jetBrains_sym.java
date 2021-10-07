package jetBrains;
import java.util.Scanner;

class jetBrains_sym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        int max = input.length() - 1;
        int sym = 1;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(max)) {
                sym += 1;
                break;
            } else {
                max -= 1;
            }
        }
        System.out.print(sym);
    }
}
