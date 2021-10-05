package jetBrains;
// Harry Potter needs help identifying what each house means.

// Read a string representing a house and output the following:

// if it is "gryffindor", output "bravery";
// if it is "hufflepuff", output "loyalty";
// if it is "slytherin", output "cunning";
// if it is "ravenclaw", output "intellect";
// otherwise, output "not a valid house".

import java.util.Scanner;

public class jetBrains_HarryPotter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next(); 
        sc.close();
        switch (name) {
            case "gryffindor":
                System.out.print("bravery");
                break;
            case "hufflepuff":
                System.out.print("loyalty");
                break;
            case "slytherin":
                System.out.print("cunning");
                break;
            case "ravenclaw":
                System.out.print("intellect");
                break;
            default: 
                System.out.print("not a valid house");        
                break;        
        }  
    }
}
