import java.util.Arrays;
import java.util.Scanner;

public class B_Books {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, t;
        n = sc.nextInt();
        t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        int i = 0;
        int j = 0;

        int len = Integer.MIN_VALUE;

        while (j < n) {
            sum += arr[j];
            while (sum > t) {
                sum -= arr[i];
                i++;
            }
            len = Math.max(len, j - i + 1);
            j++;
        }
        System.out.println(len);
    }
}