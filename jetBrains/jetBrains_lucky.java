package jetBrains;
import java.util.Scanner;

public class jetBrains_lucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String[] strArr = str.split("");
        int[] array = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            array[i] = Integer.parseInt(strArr[i]);
        }
        if (array[0] + array[1] + array[2] == array[3] + array[4] + array[5]) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}

