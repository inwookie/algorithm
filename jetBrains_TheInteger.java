import java.util.Scanner; 

public class jetBrains_TheInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int exceed = 0;
        
        while (sc.hasNext()) {
            int n = sc.nextInt(); 
            if (n == 0) {
                if (sum >= 1000) {
                    exceed = 1000;
                }
                break;
            } else if (sum >= 1000) {
                exceed = 1000;
            } else if (n >= 1000) {
                exceed = 1000;
                sum += n;
            } else {
                sum += n;
            }
        }
        sc.close();
        sum -= exceed; 
        System.out.print(sum);
    }
}
