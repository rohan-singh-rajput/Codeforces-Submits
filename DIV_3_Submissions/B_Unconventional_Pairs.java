import java.util.Arrays;
import java.util.Scanner;

public class B_Unconventional_Pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int maxDiff = 0;

            for (int i = 1; i < n; i += 2) {
                int prev = arr[i - 1];
                int curr = arr[i];

                maxDiff = Math.max(maxDiff, Math.abs(prev - curr));
            }

            System.out.println(maxDiff);
        }
        sc.close();
    }
}