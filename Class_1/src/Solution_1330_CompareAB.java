import java.util.Scanner;

public class Solution_1330_CompareAB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println(">");
        } else if (A == B) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }

}
