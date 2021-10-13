import java.util.Scanner; 

public class BaekJoon_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int grade = sc.nextInt();
            if (grade < 40) {
                grade = 40;
            } 
            sum += grade;
        }

        sc.close();
        
        System.out.print(sum / 5);
    }
}

