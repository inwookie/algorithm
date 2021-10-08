package jetBrains;

public class jetBrains_AtoZ {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 'A'; i <= 'Z'; i++) {
        sb.append((char) i).append(" ");
    }
    System.out.print(sb.deleteCharAt(sb.length() -1));
    }
}

