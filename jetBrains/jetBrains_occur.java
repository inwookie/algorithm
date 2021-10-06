package jetBrains;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jetBrains_occur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String sub = br.readLine();
        
        Pattern pattern = Pattern.compile(sub);
        Matcher matcher = pattern.matcher(word);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.print(count);



    }
}
