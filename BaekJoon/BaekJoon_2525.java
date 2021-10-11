import java.util.Scanner;

public class BaekJoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int mins = sc.nextInt() + sc.nextInt();

        sc.close();

        while (mins > 59) {
            hour++;
            mins -= 60;
        }
        while (hour > 23) {
            hour -= 24; 
        }
        System.out.print("%d %d", hour, mins);
    }
    
}

