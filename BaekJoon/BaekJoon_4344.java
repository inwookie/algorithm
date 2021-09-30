import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BaekJoon_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 

        int testCase = Integer.parseInt(br.readLine());
        int[] arr; 

        for (int i = 0; i < testCase; i++) {
            
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];

            double sum = 0;

            for (int j = 0; j < n; j++) {
                int val =Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }

            double mean = (sum / n);
            double count = 0;

            for (int k = 0; k < n; k++) {
                if (arr[k] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/n)*100);
        }

    }
}