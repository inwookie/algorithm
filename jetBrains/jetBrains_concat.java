package jetBrains;
import java.util.Scanner;

public class jetBrains_concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        scanner.close();

        StringBuilder sb = new StringBuilder();
        
        for (String s: strings) {
            sb.append(s.replaceAll("\\d",""));
        }
        System.out.print(sb);
    }

}
