import java.util.Scanner;

public class Solution_2884_Alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < 45) {
            H -= 1;
            if (H == -1) {
                H = 23;
            }
            M += 60;
        }
        System.out.println(H + " " + (M-45));
    }
}
