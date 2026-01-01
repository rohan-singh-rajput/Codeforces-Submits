import java.util.Scanner;

public class A_Theatre_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        System.out.println((long) ((n + k - 1) / k) * ((m + k - 1) / k));

        sc.close();
    }
}