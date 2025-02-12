import java.util.Scanner;

public class Solution_31403_AplusBminusC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String str = "";
        str = str + A + B;



        System.out.println(A + B - C);
        System.out.println(Integer.parseInt(str) - C);
    }
}
