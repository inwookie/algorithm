import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Get test case from an input 
        int testCase = Integer.parseInt(br.readLine());
        // Create array with testCase number 
        String arr[] = new String[testCase];

        // Given an input lines, put each lines according to i index 
        for (int i = 0; i < testCase; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < testCase; i++) {

            // count of number of consecutive 0
            int count = 0;
            // sum of point given for number of consecutive 0 
            int sum = 0;

            // for each lines within array 
            for (int j = 0; j < arr[i].length(); j++) {
                
                // get each characters from a line and compare it to O
                if (arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    // reset to 0 if a given character is not 0 to start over the point system
                    count = 0;
                }
                sum += count;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}