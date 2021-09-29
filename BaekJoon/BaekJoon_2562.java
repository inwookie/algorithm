import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BaekJoon_2562 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int max = Integer.parseInt(br.readLine());
        int count = 1; 

		for (int i = 1; i < 9; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val > max) {
                max = val; 
                count = i + 1;
            }
        }
		System.out.println(max);
        System.out.println(count);
	}
}