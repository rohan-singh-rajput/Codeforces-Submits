import java.util.Scanner;

public class A_Polycarp_and_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int x = 1;
            int y = 1;

            int minDiff = 100000000;

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if ((i + 2 * j) == n) {
                        int diff = Math.abs(i - j);
                        if (diff < minDiff) {
                            x = i;
                            y = j;
                        }
                    }
                }
            }

            System.out.println(x + " " + y);
        }

        sc.close();
    }
}