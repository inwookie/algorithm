package jetBrains;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class jetBrains_cuttingMiddle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        StringBuilder sb = new StringBuilder(word);

        if (word.length() % 2 != 0) {
            sb.deleteCharAt(word.length() / 2);
        } else {
            sb.deleteCharAt(word.length() / 2);
            sb.deleteCharAt(word.length() / 2 - 1);
        }
        String resString = sb.toString();

        for (int i = 0; i < resString.length(); i++) {
            System.out.print(resString.charAt(i));
        }

    }
}



