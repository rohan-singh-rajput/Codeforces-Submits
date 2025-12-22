import java.util.Scanner;

public class A_Domino_piling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;

        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println((m * n) / 2);
        sc.close();
    }
}