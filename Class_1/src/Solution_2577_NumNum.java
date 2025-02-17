import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution_2577_NumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        long total = A * B * C;
        String str = Long.toString(total);
        int[] arr = new int[10];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            arr[Character.getNumericValue(str.charAt(i))]++;
        }

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
