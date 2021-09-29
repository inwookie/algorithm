import java.util.Scanner; 

public class BaekJoon_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();
        
        scanner.close();
        
        String res = (90 <= grade && grade <= 100) ? "A" :
            ((80 <= grade && grade <= 89) ? "B" :
             ((70 <= grade && grade <= 79) ? "C" :
             (60 <= grade && grade <= 69) ? "D" : "F"));
        System.out.print(res);  
    }
}

