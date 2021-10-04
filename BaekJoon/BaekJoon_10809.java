import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        // default array 
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        String s = br.readLine();

        
        for (int i = 0; i < s.length(); i++) {
            // store given word's alphabet 
            char ch = s.charAt(i);

            // convert default array with a given alphabet - 'a'/97
            if (arr[ch -'a'] == -1) {
                arr[ch - 'a'] =  i; 
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
}
