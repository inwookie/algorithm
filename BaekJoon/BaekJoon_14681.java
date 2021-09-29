import java.util.Scanner; 

public class BaekJoon_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int corX = scanner.nextInt();
        int corY = scanner.nextInt();
        
        
        scanner.close();
        
        
        String res = (1 <= corX && 1 <= corY ? "1" :
                      (1 <= corX && corY <= 1 ? "4" :
                      (corX <= 1 && corY <= 1 ? "3" : "2")));
        System.out.print(res);  
    }
}

