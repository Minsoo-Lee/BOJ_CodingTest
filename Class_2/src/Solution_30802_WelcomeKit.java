import java.util.Scanner;

public class Solution_30802_WelcomeKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }

        int T = scanner.nextInt();
        int P = scanner.nextInt();

        int shirts = 0;

        for (int i = 0; i < 6; i++) {
            shirts += arr[i] / T + 1;
            if (arr[i] % T == 0)
                shirts -= 1;
            System.out.println(shirts);
        }


        int piece = N % P;

        System.out.println(shirts);
        System.out.println(N / P + " " + N % P);

    }
}
