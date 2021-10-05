import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class jetBrains_calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        long a = input.charAt(0) - '0';
        long b = input.charAt(4) - '0';
        char s = input.charAt(2);

        switch (s) {
            case '-':  
                subtractTwoNumbers(a, b);
                break;
            case '+':  
                sumTwoNumbers(a, b);
                break;
            case '/':  
                divideTwoNumbers(a, b);
                break;
            case '*':  
                multiplyTwoNumbers(a, b);
                break;
        }
    }
    public static void subtractTwoNumbers(long a, long b) {
        System.out.print(a - b); 
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.print(a + b); 
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.print("Division by 0!");
        } else {
            System.out.print(a / b); 
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.print(a * b); 
    }
}

