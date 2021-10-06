package jetBrains;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class jetBrains_parseUrl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String url = br.readLine();
        StringBuilder pass = new StringBuilder();

        String data = url.substring(url.indexOf("?") + 1, url.length());
        
        String[] keys = data.split("&");

        for (int i = 0; i < keys.length; i++) {
            String s = keys[i];
            pass.append("pass".equals(s.substring(0, s.indexOf('='))) ? s.substring(s.indexOf('=') + 1) : "");
            System.out.print(s.substring(0, s.indexOf('=')) + " : ");
            System.out.println((s.indexOf('=') + 1 == s.length()) ? "not found" : s.substring(s.indexOf('=') + 1));
        }
        System.out.print(pass.length() > 0 ? "password : " + pass : "");
    }
}


