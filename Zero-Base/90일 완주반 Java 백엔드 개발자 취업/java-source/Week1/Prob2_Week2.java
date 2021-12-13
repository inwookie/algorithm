package Week1;
import java.util.Scanner;

public class Prob2_Week2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String menu = "[메뉴선택]\n1. 회원 관리\n2. 과목 관리\n3. 수강 관리\n4. 결제 관리\n5. 종료";
        System.out.println(menu);

        int n = sc.nextInt();

        while (n != 5) { 
            if (n == 1) {
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                System.out.println(menu);
                n = sc.nextInt();
            } else if (n == 2) {
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                System.out.println(menu);
                n = sc.nextInt();
            } else if (n == 3) {
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                System.out.println(menu);
                n = sc.nextInt();
            } else if (n == 4) {
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                System.out.println(menu);
                n = sc.nextInt();
            } else {
                System.out.println("메뉴를 다시 선택 해주세요.");
                System.out.println(menu);
                n = sc.nextInt();
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
