import java.util.Scanner;

public class Solution_3052_Rest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rest = new int[42];
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            int x = arr[i] % 42;
            rest[x]++;
        }

        int total = 0;

        for (int i = 0; i < 42; i++) {
            if (rest[i] > 0) total++;
        }
        System.out.println(total);
    }
}
