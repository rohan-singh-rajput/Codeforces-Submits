import java.util.Scanner;

public class A_Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            int cnt = 0;

            cnt += (b > a ? 1 : 0);
            cnt += (c > a ? 1 : 0);
            cnt += (d > a ? 1 : 0);

            System.out.println(cnt);
        }

        sc.close();
    }
}