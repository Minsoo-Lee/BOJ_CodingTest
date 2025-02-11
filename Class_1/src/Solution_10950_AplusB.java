import java.util.Scanner;

public class Solution_10950_AplusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            arr[i] = A + B;
        }
        for (int i : arr)
            System.out.println(i);
    }
}
