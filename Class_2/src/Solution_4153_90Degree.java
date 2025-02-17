import java.util.Scanner;

public class Solution_4153_90Degree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0)
                break;

            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println("right");
            } else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                System.out.println("right");
            } else if (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}

