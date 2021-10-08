package jetBrains;
import java.util.*;

public class jetBrains_randomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        List<Integer> randomList = new ArrayList<>(List.of(0, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(randomList);

        while (randomList.get(0) == 0) {
            Collections.shuffle(randomList);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(randomList.get(i));
        }
    }
}
