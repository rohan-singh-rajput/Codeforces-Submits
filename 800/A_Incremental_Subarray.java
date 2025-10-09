import java.util.Scanner;

public class A_Incremental_Subarray {

    private static int check(int[] arr, int n) {
        int size = arr.length;

        int last = arr[arr.length - 1];
        int first = arr[0];

        int diff = arr.length - 1;

        if (diff + first != last) {
            return 1;
        } else {
            return (n - (last - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int m = sc.nextInt();

            int[] arr = new int[m];

            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }

            int res = check(arr, n);
            System.out.println(res);

        }
    }
}