import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_1065 {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
    }    

    public static int arithmetic_sequence(int n) {
        int count = 0;

        if (n < 100) {
            return n;
        } else { 
            count = 99;
            if (n == 1000) {
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int hun = i / 100;
                int ten = i / 10 % 10;
                int one = i % 10; 

                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
        }
        return count; 
    }
}

