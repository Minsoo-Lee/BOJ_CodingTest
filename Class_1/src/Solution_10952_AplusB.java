import java.util.Scanner;

public class Solution_10952_AplusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = 1;
        int B = 1;

        while (true) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            if (A == 0 && B == 0) {
                break;
            } else {
                System.out.println(A + B);
            }
        }

        scanner.close();
    }
}
