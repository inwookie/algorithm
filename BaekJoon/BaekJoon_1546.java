import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BaekJoon_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        double arr[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        
        Arrays.sort(arr);

        double max = arr[arr.length - 1];
        double sum = 0; 

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / max) * 100; 
        }
        System.out.print(sum / arr.length); 
    }
}