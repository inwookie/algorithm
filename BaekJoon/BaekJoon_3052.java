import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BaekJoon_3052 {
    public static void main(String[] args) throws IOException {
 
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        int count = 0;

        for(boolean val : arr) {
            if(val){    
                count++;
            }
        }
        System.out.println(count);
    }
}