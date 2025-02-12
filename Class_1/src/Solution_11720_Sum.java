import java.util.Arrays;
import java.util.Scanner;

public class Solution_11720_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        String str = scanner.next();

        for (int i = 0; i < N; i++) {
            arr[i] = str.charAt(i) - '0';
        }
        System.out.println(Arrays.stream(arr).sum());

        scanner.close();
    }
}
