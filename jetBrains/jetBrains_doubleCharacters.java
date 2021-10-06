package jetBrains;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class jetBrains_doubleCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            System.out.print(word.charAt(i));
        }

    }
}