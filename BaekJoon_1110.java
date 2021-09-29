import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1110 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        int checker = n; 

        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;

            if (checker == n) {
                break;
            }
        }
        System.out.print(count);

    }
}

