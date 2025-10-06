import java.util.Arrays;
import java.util.Scanner;

public class B_Unconventional_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int l = 0;
            int h = 1;

            int diff = Integer.MIN_VALUE;

            while (h < size) {
                diff = Math.max(diff, Math.abs(arr[h] - arr[l]));
                l += 2;
                h += 2;
            }

            System.out.println(diff);
        }

        sc.close();
    }
}