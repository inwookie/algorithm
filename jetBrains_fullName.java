// Don't delete scanner import
import java.util.Scanner;

class jetBrains_fullName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            System.out.println(createFullName(firstName, lastName));
        }
    }    

    //implement your method here
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
