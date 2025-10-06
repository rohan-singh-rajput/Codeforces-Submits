import java.util.Arrays;
import java.util.Scanner;

public class A_Puzzles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] puzzles = new int[m];

        for (int i = 0; i < m; i++) {
            puzzles[i] = sc.nextInt();
        }

        Arrays.sort(puzzles);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            minDiff = Math.min(minDiff, puzzles[i + n - 1] - puzzles[i]);
        }

        System.out.println(minDiff);

        sc.close();
    }
}