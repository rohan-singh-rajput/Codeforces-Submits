import java.util.Scanner;

public class A_Be_Positive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int cnt_zeroes = 0;
            int cnt_negs = 0;

            int moves = 0;

            while (n-- > 0) {
                int temp = sc.nextInt();

                if (temp == 0) {
                    ++cnt_zeroes;
                } else if (temp == -1) {
                    ++cnt_negs;
                }
            }

            if (cnt_negs % 2 != 0) {
                moves += 2;
            }
            moves += cnt_zeroes;

            System.out.println(moves);
        }
    }
}