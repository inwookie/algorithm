import java.util.*;

public class BaekJoon_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);

        System.out.print(arr[1]);



    }
    
}
