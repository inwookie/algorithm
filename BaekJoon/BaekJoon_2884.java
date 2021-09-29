import java.util.Scanner; 

public class BaekJoon_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int mins = scanner.nextInt();
        
        scanner.close();
        
        if (mins < 45) {
            hour--; 
            mins = 60 - (45 - mins);
            if (hour < 0) {
                hour = 23; 
            } 
            System.out.print(hour + " " + mins);
        } else {
            mins = mins - 45;
            System.out.print(hour + " " + mins);
        }
    }
}

