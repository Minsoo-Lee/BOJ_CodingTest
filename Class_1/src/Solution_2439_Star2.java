import java.util.Scanner;

public class Solution_2439_Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int j = 0;
            for (; j < N-i-1; j++) {
                System.out.print(" ");
            }
            for (; j < N; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
