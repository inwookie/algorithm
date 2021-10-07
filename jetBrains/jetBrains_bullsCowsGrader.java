package jetBrains;
import java.util.Scanner;

public class jetBrains_bullsCowsGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secret = "1997";
        String n = sc.nextLine();
        sc.close();
        
        int bull = 0;
        int cow = 0;
        
        for (int i = 0; i < 4; i++) {
            if (secret.indexOf(n.charAt(i)) != -1 && n.charAt(i) == secret.charAt(i)) {
                bull++;
            } else if (secret.indexOf(n.charAt(i)) != -1) {
                cow++;
            }
        }

        if (cow > 0 && bull > 0) {
            System.out.print("Grade: " + bull + " bull(s) and " + cow + " cow(s). The secret code is " + secret + ".");
        } else if (cow == 0) {
            System.out.print("Grade: " + bull + " bull(s). " + "The secret code is " + secret + ".");
        } else if (bull == 0) {
            System.out.print("Grade: " + cow + " cow(s). " + "The secret code is " + secret + ".");
        } else {
            System.out.print("Grade: None. The secret code is " + secret + ".");
        }
    }
}