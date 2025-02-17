import java.util.Arrays;
import java.util.Scanner;

public class Solution_1152_WordNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();

        str = str.trim();
        String[] arr = str.split(" ");

        if (arr[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(Arrays.stream(arr).count());
        }
    }
}
