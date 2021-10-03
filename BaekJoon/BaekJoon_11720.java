import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            sum += (s.charAt(i) - '0');
        }

        // for (byte value: br.readLine().getBytes()) {
        //     sum += (value- '0');
        // }
        System.out.print(sum);

    }
}
