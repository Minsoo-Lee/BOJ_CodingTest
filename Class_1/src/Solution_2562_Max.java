import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Solution_2562_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = stream(arr).max().getAsInt();
        System.out.println(max);
        System.out.println(arr);
        int n = 1;
        for (int a : arr) {
            if (a == max) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
