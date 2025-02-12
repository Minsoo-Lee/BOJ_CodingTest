import java.util.Scanner;

public class Solution_27866_StringChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        int i = scanner.nextInt();

        System.out.println(A.charAt(i-1));

        scanner.close();
    }
}
