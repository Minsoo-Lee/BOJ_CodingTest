import java.util.Scanner;

public class Solution_2675_StrIter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        String[] arr = new String[T];


        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < R; k++) {
                    if (j == 0 && k == 0) {
                        arr[i] = Character.toString(str.charAt(j));
                    } else {
                        arr[i] += str.charAt(j);
                    }
                }
            }
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
