import java.util.Scanner;

public class Solution_2739_Gugudan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        for (int x = 1; x <= 9; x++) {
            System.out.println(A + " * " + x + " = " + A*x);
        }

    }
}
