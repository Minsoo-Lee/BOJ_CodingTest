import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

public class Solution_1008_AdivB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextInt();
        double B = scanner.nextInt();
        System.out.println(A / B);
    }
}
