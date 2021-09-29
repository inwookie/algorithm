import java.util.Scanner; 

public class BaekJoon_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        
        scanner.close();
        
        String res = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "1" : "0";
        System.out.print(res);  
    }
}

