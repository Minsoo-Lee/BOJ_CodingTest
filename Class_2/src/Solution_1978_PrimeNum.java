import java.util.Arrays;
import java.util.Scanner;

public class Solution_1978_PrimeNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i =0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int total = 0;
        int max = Arrays.stream(arr).max().getAsInt();

        boolean[] primes = getPrimes(max);

        for (int i: arr) {
            if (primes[i] == false) {
                total++;
            }
        }

        System.out.println(total);
    }

    public static boolean[] getPrimes(int N) {
        boolean[] prime = new boolean[N+1];	 // 0 ~ N
        prime[0] = prime[1] = true;  // 숫자 0과 1은 소수가 아님

        // √N(제곱근) 이하까지 반복
        for(int i = 2; i <= Math.sqrt(N); i++) {
            if(prime[i] == true)  // 이미 한번 체크된 배열이면 continue
                continue;

            // i의 배수라면 소수가 아니므로 true
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
        return prime;
    }
}
