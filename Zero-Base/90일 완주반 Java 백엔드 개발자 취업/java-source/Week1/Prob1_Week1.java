package Week1;

// Condition: Can only use for loop once 

public class Prob1_Week1 {
    public static void main(String[] args) {
        char startValue = Character.MIN_VALUE;
        char endValue = Character.MAX_VALUE;

        char name1 = '백';
        char name2 = '인';
        char name3 = '욱';
        String a = "";
        String b = "";
        String c = "";

        for (int i = startValue; i <= endValue; i++) {
            if (name1 == (char) i) {
                a = String.format("%04X", i);
            } else if (name2 == (char) i) {
                b = String.format("%04X", i);
            } else if (name3 == (char) i) {
                c = String.format("%04X", i);
            }
        }
        System.out.print(a + ", " + b + ", " + c);
    }
}
