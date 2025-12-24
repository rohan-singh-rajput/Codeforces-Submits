import java.util.Scanner;

public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int total = (w * ((w + 1)) / 2) * k;

        int res = total - n;

        if (n >= total) {
            System.out.println(0);
        } else {
            System.out.println(res);
        }
        sc.close();

    }
}