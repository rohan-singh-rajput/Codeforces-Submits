import java.util.Scanner;

public class A_Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int cnt = 0;

        while (t-- > 0) {

            int sum = 0;

            for (int i = 0; i < 3; i++) {
                int temp = sc.nextInt();
                sum += temp;
            }

            if (sum >= 2) {
                ++cnt;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}